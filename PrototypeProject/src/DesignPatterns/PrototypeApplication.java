package DesignPatterns;

public class PrototypeApplication {
	
	public static void main (String[] args) {
		
		AnimalRegistry animreg= new AnimalRegistry();
		Lion lion= (Lion) animreg.getAnimal(AnimalType.LION);
		
		System.out.println(lion);
		
		lion.setType("Asiatic");
		
		System.out.println(lion);
		
		Lion lionnew= (Lion) animreg.getAnimal(AnimalType.LION);
		System.out.println(lionnew);
		
	}

}
