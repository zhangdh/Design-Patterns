package state.example2;

public class RedState implements State{
	private static State instance = null;
	public static State getInstance(){
		 if(instance==null){
	            instance = new RedState();
	      }
	     return instance;
	}
	
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "red";
	}

	@Override
	public void last(Context c) {
		// TODO Auto-generated method stub
		c.setState(GreenState.getInstance());
	}

	@Override
	public void next(Context c) {
		// TODO Auto-generated method stub
		c.setState(BlueState.getInstance());
	}

}
