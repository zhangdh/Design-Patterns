package handler;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectHandler project  = new ProjectHandler();
		DeptHandler dept = new DeptHandler();
		GeneralHandler general = new GeneralHandler();
		project.setNextHandler(dept);
		dept.setNextHandler(general);
		
		project.doHandler("zhangdh",100);
		project.doHandler("rongly",600);
		project.doHandler("huming",8000);
		project.doHandler("zhanghj",80000);
	}
}
