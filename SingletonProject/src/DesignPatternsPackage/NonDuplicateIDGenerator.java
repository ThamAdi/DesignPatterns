package DesignPatternsPackage;

public class NonDuplicateIDGenerator {
	
	private int ndid;
	private static volatile NonDuplicateIDGenerator nonDuplicateIDGenerator;
	
	private NonDuplicateIDGenerator() {
		
		ndid=0;
		
	}
	public static NonDuplicateIDGenerator getNonDuplicateIDGenerator() {
		if (nonDuplicateIDGenerator==null) {

			synchronized (NonDuplicateIDGenerator.class) {
				
				if(nonDuplicateIDGenerator==null) {
					
					nonDuplicateIDGenerator= new NonDuplicateIDGenerator();
					
				}
			}
		}
		
		return nonDuplicateIDGenerator;
	}
	
	public int getNext() {
		
		return ++ndid;
		
	}

}
