package handler;

public class ProjectHandler extends Handler{

	@Override
	public void doHandler(String user, double free) {
		// TODO Auto-generated method stub
		if(free < 500){
			System.out.println("项目经理给予报销,申请报销人员:"+user);
		}else{
			if(this.getNextHandler() != null){
				this.getNextHandler().doHandler(user, free);
			}
			
		}
	}

}
