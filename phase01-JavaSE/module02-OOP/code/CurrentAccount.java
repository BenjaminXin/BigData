/*
 * CurrentAccount 类
 */


public class CurrentAccount extends Account {

	public CurrentAccount () {}

	@Override
	public double getInterest() {
		double money = getMoney();
		double interest = money * 0.01;
		return interest;
	}
}
