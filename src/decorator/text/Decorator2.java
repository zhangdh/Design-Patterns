package decorator.text;

public class Decorator2 implements Sourcable{
private Sourcable source ;
	
	public Decorator2(Sourcable source){
		super();
		this.source = source;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("装饰器2 ，调用原有方法前");
		source.operation();
		System.out.println("装饰器2 ，调用原有方法后");
	}

}
