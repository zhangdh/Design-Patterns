package observer;

import java.util.Observable;
import java.util.Observer;

public class Man implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("#########被通知到Man##########");
		System.out.println(((Product)o).getName()+arg);
	}

}
