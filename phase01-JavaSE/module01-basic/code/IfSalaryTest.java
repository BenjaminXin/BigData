/*
 * if elseif else 分支结构，计算个人所得税
 */

import java.util.Scanner;


public class IfSalaryTest {

	public static void main(String[] args) {

		// 1. 输入薪水		
		System.out.println("输入薪水收入：");
		Scanner scanner = new Scanner(System.in);
		int salary = scanner.nextInt();
		
		// 2. 判断，计算
		//  tax 个人所得税
		double tax = 0.0;

		/*
		if(salary <= 5000) {
			System.out.println("no tax is needed");
		} 
		else if(salary <= 8000) {
			tax = (salary - 5000) * 0.03;
		}
		else if(salary <= 17000) {
			tax = (salary - 8000) * 0.1 + (8000 - 5000) * 0.03;
		}
		else if(salary <= 30000) {
			tax = (salary - 17000) * 0.2 + (17000 - 8000) * 0.1 + (8000 - 5000) * 0.03;
		}
		else if(salary <= 40000) {
			tax = (salary - 30000) * 0.25 + (30000 - 17000) * 0.2 + (17000 - 8000) * 0.1 + (8000 - 5000) * 0.03;
		}
		else if(salary <= 60000) {
			tax = (salary - 40000) * 0.3 + (40000 - 30000) * 0.25 + (30000 - 17000) * 0.2 + (17000 - 8000) * 0.1 + (8000 - 5000) * 0.03;
		}
		else if(salary <= 85000) {
			tax = (salary - 60000) * 0.35 + (60000 - 40000) * 0.3 + (40000 - 30000) * 0.25 + (30000 - 17000) * 0.2 + (17000 - 8000) * 0.1 + (8000 - 5000) * 0.03;
		}
		else if(salary > 85000) {
			tax = (salary - 85000) * 0.45 + (85000 - 60000) * 0.35 + (60000 - 40000) * 0.3 + (40000 - 30000) * 0.25 + (30000 - 17000) * 0.2 + (17000 - 8000) * 0.1 + (8000 - 5000) * 0.03;
		}
		*/
		if(salary <= 5000) {
			System.out.println("no tax is needed");
		} 
		else if(salary <= 8000) {
			tax = (salary - 5000) * 0.03 - 0;
		}
		else if(salary <= 17000) {
			tax = (salary - 5000) * 0.1 - 210; 
		}
		else if(salary <= 30000) {
			tax = (salary - 5000) * 0.2 - 1410; 
		}
		else if(salary <= 40000) {
			tax = (salary - 5000) * 0.25 - 2660; 
		}
		else if(salary <= 60000) {
			tax = (salary - 5000) * 0.3 - 4410; 
		}
		else if(salary <= 85000) {
			tax = (salary - 5000) * 0.35 - 7160; 
		}
		else if(salary > 85000) {
			tax = (salary - 5000) * 0.45 - 15160; 
		}
		// 3. 输出
		System.out.println("tax = " + tax);
	}
}
