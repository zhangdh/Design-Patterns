package Facade;

public class Client {
	public static void main(String[] args){
		//在不采用facade 门面模式时，如果需要执行Module中的方法时需要正常的实例化不同的类，调用其方法
		
		ModuleA a = new ModuleA();
		a.execute();
		
		ModuleB b = new ModuleB();
		b.execute();
		
		ModuleC c = new ModuleC();
		c.execute();
		
		//如果有外观类，则只针对一个外观类进行操作就可以了
		System.out.println("运用外观模式类就行操作");
		
		ModuleFacade facade = new ModuleFacade();
		facade.excuteModuleA();
		facade.excuteModuleB();
		facade.excuteModuleC();
		
	}
}
