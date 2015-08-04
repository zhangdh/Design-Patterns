package prototype;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype implements Cloneable{
	public String name ;
	
	public ArrayList<String > list = new ArrayList<String>();
	
	
	public void setName(String n){
		this.name = n;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setList(String l){
		this.list.add(l);
	}
	public ArrayList getList(){
		return this.list;	
	}
	
	public Object clone(){
		try {
			ConcretePrototype self = null;
			self =  (ConcretePrototype)super.clone();
			//因为集合类属于引用类型，如果没有此段代码，则只是浅复制（复制后的对象对于引用类型的操作会影响到原对象。）
			//加上此段代码则为深复制，复制后的对象对于引用类型变量修改不影响原对象
			self.list = (ArrayList<String>) this.list.clone(); 
			return self;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null; 
		}
	}
}
