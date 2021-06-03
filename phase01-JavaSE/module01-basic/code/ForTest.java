/*
 * for 循环
 */
 


public class ForTest {

	public static void main(String[] args) throws Exception {

		for(int i = 1; i < 10; i ++) {
			System.out.println("第" + i + "场游戏");
			Thread.sleep(3000);	// 模拟睡眠3秒
		}
		System.out.println("游戏结束");
	}
}
