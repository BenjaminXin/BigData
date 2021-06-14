/*
 * Account 类
 */


public abstract class Account {

	private double money;

	Account () {}

	Account (double money) {
		setMoney(money);
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if (money >= 0) {
			this.money = money;
		} else {
			System.out.println("money is out of range...");
		}
	}

	public abstract double getInterest();

	public void show() {
		System.out.println("money: " + getMoney());
		System.out.println("interest: " + getInterest());
	}
}
