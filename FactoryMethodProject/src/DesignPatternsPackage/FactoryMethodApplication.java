package DesignPatternsPackage;

public class FactoryMethodApplication {
	
	public static void main(String[] args) {
		
		Package packageOne= PackageFactory.createPackage(PackageCode.BASIC);
		System.out.println(packageOne);
		
		Package packageTwo= PackageFactory.createPackage(PackageCode.PREMIUM);
		System.out.println(packageTwo);
		
		Package packageThree= PackageFactory.createPackage(PackageCode.DELUXE);
		System.out.println(packageThree);
		
	}
	

}
