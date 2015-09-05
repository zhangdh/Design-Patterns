package Composite.work;

public class Employe implements Worker{
	private String name;  
    
    public Employe(String name) {  
        super();  
        this.name = name;  
    }  
    
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println(toString());  
	}
	 @Override  
    public String toString() {  
        // TODO Auto-generated method stub  
        return "我叫"+getName()+",就一普通员工!";  
	    }  
	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }     
}
