/*
 * switch case 字符界面
 */
 
import java.util.Scanner;


public class SwitchShellTest {

	public static void main(String[] args) {

		// 1. 结构化字符界面绘制
		System.out.println("        欢迎进入系统        ");
		System.out.println("----------------------------");
		System.out.println("[1] 学院系统  [2] 管理员系统");
		System.out.println("[0] 退出系统                ");

		System.out.println("请输出序号，进入命令: ");
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();

		// 2. 用户输入选择
		switch(index) {
			case 1: System.out.println("学院系统...");break;
			case 2: System.out.println("管理员系统...");break;
			case 0: System.out.println("退出系统...");break;
			default: System.out.println("输入错误");//break;
		}
		
	}
}
