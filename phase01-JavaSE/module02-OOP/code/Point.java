/*
 * Point 类
 */


import java.util.Arrays;


public class Point {

	int x;
	int y;


	// int类型的变量，不赋值，初始值默认为0
	Point() {
	}

	// 带有参数的构造函数
	Point(int x, int y) {
		this.x = x;		
		this.y = y;
	}

	
	void up() {
		y--;
	}

	void up(int i) {
		y -= i;
	}


	// 自定义成员方法，实现Point类型对象的获取，并返回
	Point getPoint() {
		return this;
	}


	// 实现成员变量的输出
	// 返回值类型 方法名(形参数列表) {}
	// 成员变量和成员方法都是类的内部成员，可以直接访问到成员变量
	void show() {
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}


	void setPosition(int a, int b) {
		x = a;
		y = b;
	}


	void showArgument(int... args) {
		for(int arg : args) {
			System.out.println("arg = " + arg);
		}
	}


	int[] getPosition() {
		//int[] pos_list = new int[] {x, y};
		int[] pos_list = new int[2];
		pos_list[0] = x;
		pos_list[1] = y;
		return pos_list;
	}



	public static void main(String[] args) {

		// 1. 声明引用变量
		Point point = new Point();
		point.show();
		
		System.out.println("----------");
		point.setPosition(3, 5);
		point.show();

		point.showArgument(1, 2, 3, 4, 5, 6, 7);

		int[] pos = point.getPosition();
		System.out.println("position = " + Arrays.toString(pos));

		System.out.println("----------");
		Point point2 = new Point(4, 5);
		point2.show();

		System.out.println("----------");
		point2.up();
		point2.show();

		System.out.println("----------");
		point2.up(2);
		point2.show();

		System.out.println("----------");
		// 调用成员方法，获取对象
		Point point3 = point.getPoint();
		System.out.println("point = " + point);
		System.out.println("point3 = " + point3);
	}
}
