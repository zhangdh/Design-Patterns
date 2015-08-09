package decorator.supermarket;

public class Client {
	public static void main(String[] args){
		Good good = new Apple("苹果","第二件半价");
		
		System.out.println("我买了第一件苹果,花费:"+good.cost());
		
		good = new DiscountApple(good);
		
		System.out.println("我买了第二件苹果,花费:"+good.cost());
		
		good = new DiscountApple(good);
		
		System.out.println("我买了三件苹果,花费:"+good.cost());
	}
}
