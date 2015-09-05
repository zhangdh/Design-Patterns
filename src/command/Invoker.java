package command;

public class Invoker {
	Command command;  
	  
    public void startExceuteCommand(Command command) {  
        this.command = command;  
        command.exceute();  
    }  
}
