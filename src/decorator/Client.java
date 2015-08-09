package decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noodle noodle = new JiDanNoodle();
		System.out.println("我要一份鸡蛋面:"+noodle.getDescriptin()+noodle.cost());
		
		noodle = new JiDan(noodle);
		
		System.out.println("我要一份鸡蛋面+一个鸡蛋:"+noodle.getDescriptin()+noodle.cost());
		
		noodle = new JiDan(noodle);
		
		System.out.println("我要一份鸡蛋面+再加个鸡蛋:"+noodle.getDescriptin()+noodle.cost());
		
		noodle = new NiuRou(noodle);
		
		System.out.println("我要一份鸡蛋面+加个牛肉:"+noodle.getDescriptin()+noodle.cost());
		
	}

}
