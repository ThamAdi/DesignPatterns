package DesignPatterns;

public class MomentoApplication {
	
	public static void main(String[] args) {
		CareTaker careTaker= new CareTaker();
		Doc doc= new Doc();
		doc.addAction(new Action("type1"));
		doc.addAction(new Action("align1"));
		
		careTaker.save(doc);
		System.out.println(doc);
		
		
		
		doc.addAction(new Action("type2"));
		careTaker.save(doc);
		System.out.println(doc);
		
		doc.addAction(new Action("align2"));
		careTaker.save(doc);
		System.out.println(doc);
		
		doc.addAction(new Action("bold1"));
		//careTaker.save(doc);
		System.out.println(doc);
		
		careTaker.revert(doc);
		System.out.println(doc);
		
		doc.addAction(new Action("highlight1"));
		//careTaker.save(doc);
		System.out.println(doc);
		
		careTaker.revert(doc);
		System.out.println(doc);
		
		careTaker.revert(doc);
		System.out.println(doc);
		
		careTaker.revert(doc);
		System.out.println(doc);
		
		careTaker.revert(doc);
		System.out.println(doc);
	
	}
	
	
}
