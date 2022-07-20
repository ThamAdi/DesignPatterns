package DesignPatterns;

import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
	
	private Map<AnimalType, Animal> animals = new HashMap<>();
	
	public AnimalRegistry() {
		
		this.initialize();
		
	}
	
	public Animal getAnimal(AnimalType animalType) {
		
		Animal animal= null;
		
		try {
			animal= (Animal) animals.get(animalType).clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return animal;
	}
	
	private void initialize() {
		
		Lion lion= new Lion();
		lion.setFoodtype("Meat");;
		lion.setNumoflegs(4);
		lion.setType("Congo");
		
		/*Parrot parrot= new Parrot();
		parrot.setIseat(1);
		parrot.setFoodtype("Herbs");
		parrot.setNumoflegs(2); */
		
		animals.put(AnimalType.LION, lion);
		//animals.put(AnimalType.PARROT, parrot);
		
	}

}
