package DesignPatternsPackage;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {
	
	protected List<MusicalShowBooking> musicalshowbooking = new ArrayList<>();
	
	public Package() {
		
		createPackage();
	}
	
	protected abstract void createPackage();

	@Override
	public String toString() {
		return "Package [musicalshowbooking=" + musicalshowbooking + "]";
	}
	
	

}
