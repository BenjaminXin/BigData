/*
 * 变量的输入和输出
 */


import java.util.Scanner;


 public class VarIOTest {

	public static void main(String[] args) {

		// 1. 声明变量
		String name;
		int age;

		// 2. 提示用户输入信息
		System.out.println("请输入姓名和年龄: ");
		//  创建Scanner, 获取输入的内容
		Scanner sc = new Scanner(System.in);
		//  读取字符串数据，放入name 和 age
		name = sc.next();
		age = sc.nextInt();

		// 3. 打印输出
		//System.out.println("name = " + name);
		//System.out.println("age = " + age);
		System.out.println("name = " + name + ", " + "age = " + age);
	}
}
