package Composite.work;

public class Client {
	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Leader leader1 = new Leader("张三");  
        Leader leader2 = new Leader("李四");  
        Employe employe1 = new Employe("王五");  
        Employe employe2 = new Employe("赵六");  
        Employe employe3 = new Employe("陈七");  
        Employe employe4 = new Employe("徐八");  
        leader1.add(leader2);  
        leader1.add(employe1);  
        leader1.add(employe2);  
        leader2.add(employe3);  
        leader2.add(employe4);  
        leader1.doSomething();           
    }  
}
