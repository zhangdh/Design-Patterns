package strategy;

public class Client {
	public static void main(String[] args) {  
        StrategyContex contex = new StrategyContex();  
          
        contex.setStrategyInterface(new Strategy1Impl());  
        contex.doSomething();  
          
        contex.setStrategyInterface(new Strategy2Impl());  
        contex.doSomething();  
          
        contex.setStrategyInterface(new Strategy3Impl());  
        contex.doSomething();  
    }  
}
