package DesignPatterns;

public class Lion extends Animal{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Lion [type=" + type + "]";
	}
	
	

}
