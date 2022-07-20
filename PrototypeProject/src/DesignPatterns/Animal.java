package DesignPatterns;

public abstract class Animal implements Cloneable{
	
	private String foodtype;
	private int numoflegs;
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public int getNumoflegs() {
		return numoflegs;
	}
	public void setNumoflegs(int numoflegs) {
		this.numoflegs = numoflegs;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
