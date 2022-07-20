package DesignPatternsPackage;

public class PackageFactory {
	
	public static Package createPackage (PackageCode packageCode) {
		
		switch (packageCode) {
		
		case BASIC:
			return new BasicPackage();
		case PREMIUM:
			return new PremiumPackage();
		case DELUXE:
			return new DeluxePackage();
		default:
			return null;
		
		}
		
	}

}
