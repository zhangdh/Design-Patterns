package template.account;

public abstract class Account {
	/*
	 * 模板方法，用于计算利息数额
	 * 根据不同的存款方式返回利息数额；具体不同存款方式实现由其子类
	 */
	public final double calculateInterest(){
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount = calculateAmount(accountType);
		return amount*interestRate;
	}
	/*
	 * 基本方法留给子类实现
	 */
	protected abstract String doCalculateAccountType();
	/*
	 * 基本方法留给子类实现
	 */
	protected abstract double doCalculateInterestRate();
	
	private double calculateAmount(String accountType){
		//省略相关业务代码
		return 12345.00;
	}
}
