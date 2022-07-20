package DesignPatterns;

public class Parrot extends Animal {
	
	private int iseat;

	public int getIseat() {
		return iseat;
	}

	public void setIseat(int iseat) {
		this.iseat = iseat;
	}

	@Override
	public String toString() {
		return "Parrot [iseat=" + iseat + "]";
	}

	
	

}
