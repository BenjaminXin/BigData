/*
 * Gold 类
 */


public class Gold implements Metal, Money {

	@Override
	public void shine() {
		System.out.println("shining...");
	}

	@Override
	public void buy() {
		System.out.println("buying...");
	}

	public static void main(String[] args) {
		
		Metal mt = new Gold();
		mt.shine();

		Money mn = new Gold();
		mn.buy();
	}
}
