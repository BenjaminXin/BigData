/*
 * Worker 类的测试
 */


public class WorkerTest {

	public static void main(String[] args) {

		// 1. 无参方式构造Worker类对象
		Worker w1 = new Worker();
		w1.show();

		System.out.println("----------");
		// 2. 有参方式构造
		// 调用成员方法
		Worker w2 = new Worker("Benjamin", 25, 15000);
		w2.show();
		w2.work();
	}
}
