package state.example1;

public class StateMachine {
	private State currentSate;
	
	    public State getCurrentSate() {
	       return currentSate;
	    }
	 
	    public void setCurrentSate(State currentSate) {
	         this.currentSate = currentSate;
	    }
}
