package decorator.supermarket;

public abstract class Discount extends Good{
	Good good;
	
	public Discount(Good good) {
		this.good = good;
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract double cost()  ;

}
