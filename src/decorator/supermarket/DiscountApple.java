package decorator.supermarket;

public class DiscountApple extends Discount{
	public DiscountApple(Good good){
		super(good);
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double price = good.cost();
		return price+price/2;
	}

}
