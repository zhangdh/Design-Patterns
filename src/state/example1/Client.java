
package state.example1;

public class Client {
	public static void main(String[] args){
		StateMachine machine = new StateMachine();
		State start = new StartState();
		machine.setCurrentSate(start);
		while(machine.getCurrentSate() !=null){
			machine.getCurrentSate().handle(machine);
		}
		System.out.println("press any key to exit ... ");

	}
}
