package builder;

import builder.engine.ChineseEngine;
import builder.glass.AmericanGlass;
import builder.wheel.JapaneseWheel;

public class CarABuilder implements CarBuilder{
	private Car product=null;

	public void CarABuilder(){
		product = new Car(); 
	}
	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		product.engine = new ChineseEngine();
	}

	@Override
	public void buildGlass() {
		// TODO Auto-generated method stub
		product.glass = new AmericanGlass();
	}

	@Override
	public void buildWheel() {
		// TODO Auto-generated method stub
		product.wheel = new JapaneseWheel();  
	}

	@Override
	public Car getProduct() {
		// TODO Auto-generated method stub
		buildGlass();  
        buildWheel();  
        buildEngine();  
        return product;  
	} 
}
