/*
 * 字符类型的使用
 */

public class CharTest {

	public static void main(String[] args) {

		// 1. 声明char类型变量，初始化
		char c1 = 'a';
		System.out.println("c1 = " + c1);
		// 将char c1 转换为int类型
		System.out.println("c1的编号 = " + (int)c1);	

		System.out.println("----------");
		
		// 2. 声明一个char类型，初始化
		char c2 = 98;
		System.out.println("c2 = " + c2);
		System.out.println("c2's code " + (int)c2);

		System.out.println("----------");
		// 3. 使用Unicode字符集表示名字
		// Benjamin 对应的编码 \u0042\u0065\u006e\u006a\u0061\u006d\u0069\u006e
		char c3 = '\u0042';
		char c4 = '\u0065';
		char c5 = '\u006e';
		System.out.println("name: " + c3 + c4 + c5);

		System.out.println("----------");
		// 4. 特殊字符的使用
		// 转义字符
		System.out.println("第一行\n第二行\t第二列\"字符\"");
	}
}
