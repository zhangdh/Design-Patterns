package adapter;
//这是一个邮件相关功能接口类，最终产品中的邮件的相关功能；在外部组件或者已有类无法完全实现此接口时就需要使用适配器模式
public interface MailInterface {
	public void sendMail();
	public void recMail();
	
	//重新发送邮件，已有类Mail.java没有实现此方法。需要扩展
	public void reSendMail();
}
