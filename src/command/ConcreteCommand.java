package command;

public class ConcreteCommand implements Command{
	Receiver receiver;  
	  
    public ConcreteCommand(Receiver receiver) {  
        this.receiver = receiver;  
    }  
  
	@Override
	public void exceute() {
		// TODO Auto-generated method stub
		 receiver.sendMessage();  
	}  
}
