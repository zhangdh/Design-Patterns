package builder;

import builder.engine.FranceEngine;
import builder.glass.JapaneseGlass;
import builder.wheel.AmericanWheel;

public class CarBBuilder implements CarBuilder{
	private Car product = null;
	public CarBBuilder(){  
        product=new Car();  
    } 
	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		 product.engine=new FranceEngine();  
	}

	@Override
	public void buildGlass() {
		// TODO Auto-generated method stub
		 product.glass=new JapaneseGlass();  
	}
	@Override
	public void buildWheel() {
		// TODO Auto-generated method stub
		 product.wheel=new AmericanWheel();  
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
