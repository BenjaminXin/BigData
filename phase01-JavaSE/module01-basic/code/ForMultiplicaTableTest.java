/*
 * 输出九九乘法表
 */



public class ForMultiplicaTableTest {

	public static void main(String[] args) {

		/*
		// 输出
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
				
				// 打印到 6*6=36时，停止打印
				// 控制列数
				if(j == 6) {
					break;
				}
			}
			System.out.println();
			// 打印到 6*6=36时，停止打印
			// 控制行数
			if(i == 6) {
				break;
			}
		}
		*/
		outer:for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
				
				// 打印到 6*6=36时，停止打印
				// 控制列数
				if(j == 6) {
					break outer;
				}
			}
			System.out.println();
		}
	}
}
