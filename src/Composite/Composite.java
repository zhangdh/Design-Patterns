package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

	public Composite(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	private  List<Component> child = new ArrayList<Component>();
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		child.add(c);
	}

	@Override
	public void foreach() {
		// TODO Auto-generated method stub
		System.out.println("节点名:\t"+name);
		for(Component c: child){
			c.foreach();
		}
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		child.remove(c);
	}

}
