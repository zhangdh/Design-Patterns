package Composite;

public class Leaf extends Component{

	public Leaf(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foreach() {
		// TODO Auto-generated method stub
		System.out.println("tself name -->"+this.name);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		
	}
	
}
