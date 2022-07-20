package DesignPatterns;

import java.util.ArrayList;

//originator 

public class Doc {
	
	ArrayList<Action> actions=new ArrayList<>();
	
	public void addAction(Action action) {
		actions.add(action);
	}

	public ArrayList<Action> getActions() {
		return (ArrayList)actions.clone();
	}
	
	public DocMomento save() {
		return new DocMomento(getActions());
	}
	
	public void revert(DocMomento docMomento) {
		 actions=docMomento.getActions();
	}
	
	@Override
	public String toString() {
		return "Doc [actions=" + actions + "]";
	}



	static class DocMomento{
		
		ArrayList<Action> actions;
		
		public DocMomento(ArrayList<Action> actions) {
			this.actions=actions;
		}

		private ArrayList<Action> getActions() {
			return actions;
		}

	
		
		
	}
	

}
