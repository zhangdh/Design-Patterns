package Facade;

public class ModuleFacade {
	private ModuleA a;
	private ModuleB b;
	private ModuleC c;
	public ModuleFacade(){
		a = new ModuleA();
		b = new ModuleB();
		c = new ModuleC();
	}
	public void excuteModuleA(){
		a.execute();
	}
	public void excuteModuleB(){
		b.execute();
	}
	public void excuteModuleC(){
		c.execute();
	}
}
