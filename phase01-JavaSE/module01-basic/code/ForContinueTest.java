/*
 * for循环，输出1-20，跳过5的倍数
 */





public class ForContinueTest {


	public static void main(String[] args) {

		// 1 - 20, 跳过5的倍数
		for(int i = 1; i <= 20; i++) {
			if(i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
