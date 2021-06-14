/*
 * ShapeRectTest
 */



public class ShapeRectTest {

	public static void main(String[] args) {

		// 1. 构造Shape类的对象
		//Shape s1 = new Shape();
		Shape s1 = new Shape(1, 2);
		s1.show();

		System.out.println("----------");
		// 2. 构造Rect类的对象
		//Rect r1 = new Rect();
		Rect r1 = new Rect(3, 4, 5, 6);
		r1.show();
		
		System.out.println("----------");
		// 3. Shape类型对象的引用，指向 构造Rect类的对象
		//Shape sr1 = new Rect();
		Shape sr1 = new Rect(7, 8, 9, 10);
		sr1.show();

		System.out.println("----------");
		// 4. Shape类型对象的引用，指向 构造Rect类的对象, 能否直接调用父类和子类的方法
		double ix = sr1.getX();
		System.out.println("ix: " + ix);

		System.out.println("----------");
		//int ilength = sr1.getLength();
		// System.out.println("ilength: " + ilength);

		System.out.println("----------");
		// 5. 调用静态方法
		//  不建议使用对象sr1 去调用父类中的静态方法
		//  而是用Shape类去调用静态方法
		sr1.test();
		Shape.test();

		System.out.println("----------");
		// 6. 引用数据类型的转换
		int ilength = ((Rect) sr1).getLength();
		System.out.println("ilength: " + ilength);

	}
}

