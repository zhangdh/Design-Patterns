package decorator.text;

public class Client {
	public static void main(String[] args){
		Sourcable source = new Source();
		//此种模式，类似于在原有对象上 包装了一层装饰器，增加了功能。
		 //Sourcable obj = new Decorator1(new Decorator2(source));
		 
		 //obj.operation();
		source.operation();
		System.out.println("添加第一层包装器");
		source = new Decorator1(source);
		source.operation();
		System.out.println("再添加第二层包装器");
		source = new Decorator2(source);
		source.operation();
	}
}
