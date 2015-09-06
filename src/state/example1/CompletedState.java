package state.example1;

public class CompletedState implements State {
	 public void handle(StateMachine machine) {
	      System.out.println("Completed");
	      machine.setCurrentSate(null);
	 }
}
