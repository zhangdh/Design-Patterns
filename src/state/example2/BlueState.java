package state.example2;

import singleton.SingletonClass;

public class BlueState implements State{
	
	private static State instance = null;
	public static State getInstance(){
		 if(instance==null){
	            instance = new BlueState();
	      }
	     return instance;
	}
	public String getState(){
		return "blue";
	}

	@Override
	public void last(Context c) {
		// TODO Auto-generated method stub
		c.setState(RedState.getInstance());
	}

	@Override
	public void next(Context c) {
		// TODO Auto-generated method stub
		c.setState(GreenState.getInstance());
	}
	
	
}
