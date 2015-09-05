package handler;

public class GeneralHandler extends Handler{

	@Override
	public void doHandler(String user, double free) {
		// TODO Auto-generated method stub
		if(free <10000 ){
			System.out.println("总经理批准报销,报销人员:"+user);
		}else{
			if(this.getNextHandler()!=null){
				this.getNextHandler().doHandler(user, free);
			}else{
				System.out.println("数额太大，不予报销，申请人员:"+user);
			}
		}
	}
}
