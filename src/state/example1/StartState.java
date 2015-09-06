package state.example1;

public  class StartState implements State {

	@Override
	public void handle(StateMachine machine) {
		// TODO Auto-generated method stub
		System.out.println("Draft...");
		machine.setCurrentSate(new PublishState());
	}
	 
	
	 
}
