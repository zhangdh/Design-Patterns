package state.example1;

public class PublishState implements State{
	 public void handle(StateMachine machine) {
	    System.out.println("Publish...");
        machine.setCurrentSate(new CompletedState());
	
	 }
}
