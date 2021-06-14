/*
 * AccountTest class
 */


public class AccountTest {

	public static void main(String[] args) {
		
		// 
		Account ac1 = new CurrentAccount();
		ac1.setMoney(10000);
		ac1.getInterest();
		ac1.show();

		System.out.println("----------");
		Account ac2 = new DepositAccount(20000);
		double interest = ac2.getInterest();
		System.out.println("interest: " + interest);
	}
}
