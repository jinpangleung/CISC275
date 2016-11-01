package gabion;

public class OysterGabion extends Gabion {
	private int OysterCount;
	
	public int getOysterCount(){
		return this.OysterCount;
	}
	
	public void OysterClicked(){
		OysterCount++;
		if (OysterCount == 6){
			health++;
			OysterCount = 0;
		}
	}
	
	public OysterGabion(){
		OysterCount = 0;
		health = 0;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
