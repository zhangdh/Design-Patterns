package Composite;

public class Client {
	public static void main(String[] args){
		Component component = new Composite("根节点");
		Component child = new Composite("一级子节点child");
		Component child_1 = new Leaf("一级子节点child之子节点1");
		Component child_2 = new Leaf("一级子节点child之子节点2");
		child.add(child_1);
		child.add(child_2);
		
		Component child2 = new Composite("一级子节点child2");
		component.add(child);
		component.add(child2);
		component.foreach();
	}
}
