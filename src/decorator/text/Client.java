package decorator.text;

public class Client {
	public static void main(String[] args){
		Sourcable source = new Source();
		//此种模式，类似于在原有对象上 包装了一层装饰器，增加了功能。
		 Sourcable obj = new Decorator1(new Decorator2(source));
		 
		 obj.operation();
	}
}
