package state.example2;

public class GreenState implements State{
	private static State instance = null;
	public static State getInstance(){
		 if(instance==null){
	            instance = new GreenState();
	      }
	     return instance;
	}
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "green";
	}

	@Override
	public void last(Context c) {
		// TODO Auto-generated method stub
		c.setState(BlueState.getInstance());
	}

	@Override
	public void next(Context c) {
		// TODO Auto-generated method stub
		c.setState(RedState.getInstance());
	}

}
