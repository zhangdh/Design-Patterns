package adapter;

//此种方式是通过 类继承实现
public class MailAdapter extends Mail implements MailInterface{

	public void sendMail(){
		System.out.println("调用了重写SendMail,发送了邮件");
	}
	@Override
	public void reSendMail() {
		// TODO Auto-generated method stub
		//适配器类额外扩展的方法，对于已有的Mail.java 不做任何扩展和修改；如果需要可以对Mail.java中的方法重写。
		System.out.println("调用了reSendMail,重新发送了邮件");
	}

}
