/*
 * 变量声明和使用
 */

 public class VarTest {

	public static void main(String[] args) {
		
		// 1. 变量声明，初始化
		int age = 18;
		// 2. 打印变量的数据
		System.out.println("age = " +  age);	// age = 18

		System.out.println("----------");
		// 3. 使用变量前，得先声明、初始化变量
		String name = "Benjamin";
		System.out.println("name = " + name); 
		// 4. 变量不能重复声明

		// 5. 变量名的命名规则, 也是标识符的命名规则
		//	- 字母、数字、下划线、$ 组成
		//  - 不能以数字开头
		//  - 不能使用java关键字
		//  - 区分大小写
		//  - 长度无限制
		//  - 见名知意，英文单词
	} 
}
