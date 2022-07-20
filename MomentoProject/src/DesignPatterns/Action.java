package DesignPatterns;

public class Action {
	
	String actname;
	
	public Action(String actname) {
		this.actname=actname;
	}

	@Override
	public String toString() {
		return "Action [actname=" + actname + "]";
	}
	
	

}
