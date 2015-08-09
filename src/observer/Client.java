package observer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product("苹果",5.0,100);
		
		Customer A = new Customer();
		Customer B = new Customer();
		//将消费者加入到产品的观察者
		p.addObserver(A);
		p.addObserver(B);
		//修改产品的价格。
		p.setPrice(6.0);
	}

}
