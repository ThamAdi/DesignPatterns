package DesignPatternsPackage;

public class SingletonApplication {
	public static void main (String[] args) {
		
		NonDuplicateIDGenerator nonDuplicateIDGenerator= NonDuplicateIDGenerator.getNonDuplicateIDGenerator();
		System.out.println(nonDuplicateIDGenerator);
		System.out.println(nonDuplicateIDGenerator.getNext());
		
		NonDuplicateIDGenerator nonDuplicateIDGenerator1= NonDuplicateIDGenerator.getNonDuplicateIDGenerator();
		System.out.println(nonDuplicateIDGenerator1);
		System.out.println(nonDuplicateIDGenerator1.getNext());
		
	}

}
