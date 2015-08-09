package decorator;

public class NiuRouNoodle extends Noodle{
	public NiuRouNoodle(){  
        description = "牛肉面";  
    } 
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 6.5;
	}
	
}
