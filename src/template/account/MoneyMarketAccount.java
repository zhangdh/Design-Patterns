package template.account;

/*
 * 具体模板角色类，活期
 */
public class MoneyMarketAccount extends Account{

	@Override
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "Money Market" ;
	}

	@Override
	protected double doCalculateInterestRate() {
		// TODO Auto-generated method stub
		return 0.045;
	}

}
