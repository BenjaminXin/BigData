/*
 * DepositAccount class
 */
 

public class DepositAccount extends Account {
	
	public DepositAccount (double money) {
		super(money);
		//setMoney(money);
	}
	
	@Override
	public double getInterest() {
		// 利息 = 本金 * 利率 * 时间
		return getMoney() * 0.03 * 1;
	}

	
	
}
