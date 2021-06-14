/*
 * Student 类的测试类
 */

import java.util.Arrays;
import java.util.Scanner;


public class StudentTest {

	public static void main(String[] args) {
		

		// 1. 输入人数，学生信息
		System.out.println("输入学生人数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		// 2. 根据学生人数，声明一个长度为num，类型为Student的一维数组
		//  其数组中的每一个元素，都是Student类的实例化对象
		Student[] students = new Student[num];
		
		// 3. 输入每一个学生的信息
		for(int i = 0; i < num; i++) {
			System.out.println("输入第 " + i + " 个学生的信息，学号，姓名");
			students[i] = new Student(scanner.nextInt(), scanner.next());
		}

		// 4. 输出所有学生信息
		System.out.println("所有学生信息:");
		// System.out.println("- " + Arrays.toString(students));
		for(Student student: students) {
			System.out.println("id: " + student.getId() + " name: " + student.getName());
		}
		/*
		for(int i = 0; i < num; i++) {
			//System.out.println(students[i].show());
			//students[i].show();
			//System.out.println("id: " + students[i].getId() + " name: " + students[i].getName());
			System.out.println(students[i].getClass());
		}
		*/
	}
}
