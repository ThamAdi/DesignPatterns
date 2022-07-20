package DesignPatternsPackage;

public class DeluxePackage extends Package {

	@Override
	protected void createPackage() {
		
		musicalshowbooking.add(new StageBook());
		musicalshowbooking.add(new LightsSoundsBook());
		musicalshowbooking.add(new MusicalInstrumentBook());
		
	}
	
	

}
