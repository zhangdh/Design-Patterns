package strategy;

public class StrategyContex {
	private StrategyInterface strategyInterface;
	public StrategyInterface getStrategyInterface (){
		return strategyInterface;
	}
	
	public void setStrategyInterface(StrategyInterface strategyInterface){
		this.strategyInterface = strategyInterface;
	}
	
	public StrategyContex(StrategyInterface strategyInterface){
		super();
		this.strategyInterface = strategyInterface;
	}
	
	public StrategyContex(){};
	public void doSomething(){
		this.strategyInterface.dosomething();
	}
}
