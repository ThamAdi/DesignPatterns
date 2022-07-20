package DesignPatterns;

import java.util.Stack;

public class CareTaker {
	
	Stack<Doc.DocMomento> history= new Stack<>();
	
	public void save(Doc doc) {
		history.push(doc.save());
	}
	
	public void revert(Doc doc) {
		
		if (!history.isEmpty())
			doc.revert(history.pop());
		else
			System.out.println("Cannot undo");
	}

}
