package adapter;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailAdapter mail = new MailAdapter();
		mail.sendMail();
		mail.recMail();
		mail.reSendMail();
	}

}
