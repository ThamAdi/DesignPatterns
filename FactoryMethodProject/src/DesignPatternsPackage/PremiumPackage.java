package DesignPatternsPackage;

public class PremiumPackage extends Package {

	@Override
	protected void createPackage() {
		
		musicalshowbooking.add(new StageBook());
		musicalshowbooking.add(new LightsSoundsBook());
		
	}
	
	

}
