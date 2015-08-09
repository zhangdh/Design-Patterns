package decorator;

public class JiDan extends Material{

    public JiDan(Noodle noodle){  
        super(noodle);  
    }  
	  
	  
	@Override
	public String getDescriptin() {
		// TODO Auto-generated method stub
		return noodle.getDescriptin()+"+ 鸡蛋 ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return noodle.cost()+0.5;
	}

}
