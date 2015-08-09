package decorator;

public class NiuRou extends Material{

	public NiuRou(Noodle noodle) {
		super(noodle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescriptin() {
		// TODO Auto-generated method stub
		return noodle.getDescriptin()+" + 牛肉 ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return noodle.cost()+1.5;
	}

}
