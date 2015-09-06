package state.example2;

public class Client {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Context c = new Context();
		State start = new BlueState();
		c.setState(new BlueState());
		while(true){
			System.out.println("当前状态："+c.getState().getState());  
            System.out.print("下一个状态: ");  
             c.pull();  
             Thread.currentThread().sleep(2000);  
		}
	}

}
