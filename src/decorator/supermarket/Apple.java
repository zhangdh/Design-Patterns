package decorator.supermarket;

public class Apple extends Good{

	public Apple(String name,String description){
		this.name=name;
		this.description = description;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10;
	}

}
