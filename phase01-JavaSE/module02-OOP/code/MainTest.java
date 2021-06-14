/*
 * main 方法
 */


public class MainTest {

	public static void main(String[] args) {

		System.out.println("args lenght = " + args.length);
		System.out.println("main方法的参数：");
		for(int i = 0; i < args.length; i++) {
			System.out.println("第 " + i + " 个参数： " + args[i]);
		}
	}
}
