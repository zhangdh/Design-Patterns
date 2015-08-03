package builder;

public class Test {
	public static void main(String[] args){
		Car carA,carB;
		CarBuilder builderA = new CarABuilder();
		CarBuilder builderB = new CarBBuilder();
		Director director;
		director = new Director(builderA);
		carA = director.construct();
		director = new Director(builderB);
		carB = director.construct();
		System.out.println("Car A is made by :"+carA.glass+carA.wheel+carA.engine);
		System.out.println("Car B is made by:"+carB.glass+carB.wheel+carB.engine);
	}
}
