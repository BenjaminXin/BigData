/*
 * for 循环，break
 */

import java.util.Scanner;


public class ForChatTest {

	public static void main(String[] args) {

		// 5. 声明一个boolean类型的变量作为发送方的标志
		boolean flag = true;

		for(;;) {
			// 1. 提示用户输入内容
			System.out.println(flag? "you: ": "bot: ");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();

			// 2. 判断内容是否为“bye”
			if("bye".equals(str)) {
				System.out.println("it's over");
				break;
			}
			
			// 3. 输出内容
			//System.out.println(str);

			// 4. 模拟两个人聊天
			System.out.println((flag? "you: ": "bot: ") + str);
			flag = !flag;
		}
	}
}
