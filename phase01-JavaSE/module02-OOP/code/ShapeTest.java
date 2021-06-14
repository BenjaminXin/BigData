/*
 * ShapeTest class
 */


public class ShapeTest {

	/*
	// 自定义成员方法，参数是矩形对象，输出是矩形对象的特征, 即绘制图形
	public static void draw(Rect r) {
		r.show();
	}

	// 自定义成员方法，打印输出圆形对象特征
	public static void draw(Circle c) {
		c.show();
	}
	*/

	// 自定义成员方法，适用与打印输出所有子类对象的特征
	public static void draw(Shape s) {
		s.show();
	}
	
	public static void main(String[] args) {

		//Rect r = new Rect(1, 2, 3, 4);
		//ShapeTest.draw(r);
		ShapeTest.draw(new Rect(4, 5, 6, 7));
		ShapeTest.draw(new Circle(1, 2, 5));
	}
}

