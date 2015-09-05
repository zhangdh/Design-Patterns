package handler;

public class DeptHandler extends Handler{

	@Override
	public void doHandler(String user, double free) {
		// TODO Auto-generated method stub
		if(free < 1000){
			System.out.println("部门经理批准报销,申请报销人员:"+user);
		}else{
			if(this.getNextHandler() != null){
				this.getNextHandler().doHandler(user, free);
			}
		}
	}

}
