package prototype;

public class Client {
	public static void main(String[] args){
		ConcretePrototype concrete = new ConcretePrototype();
		concrete.setName("zhangdh1");
		concrete.setList("list1");
		ConcretePrototype concrete1 = (ConcretePrototype)concrete.clone();
		
		
		concrete1.setName("zhangdh2");
		concrete1.setList("list2");
		System.out.println(concrete.getName());
		System.out.println(concrete1.getName());
		
		System.out.println(concrete.getList());
		System.out.println(concrete1.getList());
	}
}
