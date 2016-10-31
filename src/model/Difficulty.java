package model;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import trailitems.*;

public class Difficulty {
	
	private int timeToSpawn;
	private final int SPAWN_TIME = 120;
	
	public Difficulty(){
		timeToSpawn = SPAWN_TIME;
	}
	
	/**
	 * Returns void
	 * <p>
	 * Look at the current Grid and decide how to scale difficulty and when to spawn new objects
	 */
	public void update(){
		if(timeToSpawn > 0){
			timeToSpawn--;
		} else {
			spawn();
			timeToSpawn = SPAWN_TIME;
		}
	}
	
	/**
	 * Place the trail item into the Grid
	 * 
	 * @param ti
	 */
	public void spawn(){
		TrailItem toBeSpawned = decideSpawn();
		List<Posn> listOfSpawnPoints = Grid.getInstance().getCells().getSpawnPositions();
		int randomIndex = ThreadLocalRandom.current().nextInt(0, listOfSpawnPoints.size());
		Posn spawnPoint = listOfSpawnPoints.get(randomIndex);
		toBeSpawned.setPosn(spawnPoint);
		Posn pixelPosn = Grid.getInstance().getPixelGrid().getValidPixelPosn(spawnPoint);
		toBeSpawned.setPixelPosn(pixelPosn);
		toBeSpawned.setPixelPosn(new Posn(toBeSpawned.getPixelPosn().getX(), 0));
		Grid.getInstance().addPath(new Path(toBeSpawned, pixelPosn, PathBehavior.STRAIGHT, PathTermination.TO_GRID, 1));
	}
	
	/**
	 * Returns void
	 * <p>
	 * Use the difficulty and what has been spawned recently to decide
	 * what needs to be spawned, avoid unwinnable scenarios
	 */
	public TrailItem decideSpawn(){
		int randomNum = (int)(Math.random() * 3); 
		if(randomNum == 0){
			return new Oyster();
		}
		else if (randomNum == 1){
			return new InvasiveItem();
		}
		else if (randomNum == 2){
			return new Larvae();
		}
		else{
			return new Pollutant(1);
		}
	}

}
