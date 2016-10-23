package cisc275_final;

public abstract class Tower extends GridItem {
	
	//// Attributes ////
	protected Color color;
	protected int cooldownRemaining;
	protected int range;
	
	
	
	////  Getters  ////
	public Color getColor(){
		return this.color;
	}
	
	public int getcooldownRemaining(){
		return this.cooldownRemaining;
	}
	
	public int getRange(){
		return this.range;
	}
	
	
	
	//// Methods ////
	public void ability(){
		
	}
	
	@Override
	public void update(){
		// TODO
	}
}
