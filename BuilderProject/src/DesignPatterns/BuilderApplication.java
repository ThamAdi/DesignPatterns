package DesignPatterns;

public class BuilderApplication {
	
	public static void main (String[] args) {
		
		Hotel.Builder builder= new Hotel.Builder();
		
		Hotel hotel= builder.accommodation("yes").food("yes").build();
		
		System.out.println(hotel);
		
	}
	

}
