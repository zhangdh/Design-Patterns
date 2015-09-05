package command;

public class Client {

	public static void main(String[] args) {  
        Receiver receiver = new Receiver();  //执行者  
        Command command = new ConcreteCommand(receiver); //命令和具体命令  
        Invoker invoker = new Invoker(); //请求者  
        invoker.startExceuteCommand(command); //请求者下达命令  
    }  

}
