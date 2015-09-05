package template;

public abstract class AbstactTemplate {
	/**
	 * 模板方法，有一个抽象类(模板)控制执行方法的基本流程，顶级逻辑
	 */
	public void templateMethod(){
		//调用基本方法
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	//由具体的类去实现
	protected abstract void abstractMethod();
	
	//可以由模板实现，也可以由其子类进行重写
	protected void hookMethod(){
		
	};
	
	private final void concreteMethod(){
		//业务相关代码
	}
}
