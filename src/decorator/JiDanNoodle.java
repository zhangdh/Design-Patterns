package decorator;

public class JiDanNoodle extends Noodle{

	public JiDanNoodle(){
		description = "鸡蛋面";  
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5.5;
	}
	
}
