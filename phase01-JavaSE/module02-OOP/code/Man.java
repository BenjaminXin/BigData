/*
 * Man 类
 */


public class Man implements Hunter {

	@Override
	public void hunting () {
		System.out.println("hunting...");
	}

	@Override
	public void running () {
		System.out.println("running...");
	}

	public static void main(String[] args) {

		Hunter h1 = new Man();
		h1.hunting();

		Runner r1 = new Man();
		r1.running();
	}
}
