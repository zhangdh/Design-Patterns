package adapter;

//通过方法的委托方式实现
public class MailAdapter1 implements MailInterface{
	 
	private Mail mail =new Mail();  
	
	@Override
	public void reSendMail() {
		// TODO Auto-generated method stub
		//适配器新增的方法
	}

	@Override
	public void recMail() {
		// TODO Auto-generated method stub
		//通过方法委托，直接调用mail的此方法
		mail.recMail();
	}

	@Override
	public void sendMail() {
		// TODO Auto-generated method stub
		//通过方法委托，直接调用mail的此方法
		mail.sendMail();
	}

}
