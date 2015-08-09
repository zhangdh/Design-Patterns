package observer;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		//被通知到
		System.out.println("#########被通知到Customer##########");
		System.out.println(((Product)arg0).getName()+arg1);
		
	}

}
