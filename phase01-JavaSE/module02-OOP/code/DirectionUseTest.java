/**
 * 
 */


public class DirectionUseTest {

	// 根据参数的字符串内容，输出内容
	public static void test1(String str) {
		switch (str) {
			case "up":
				System.out.println("up"); break;
			case "down":
				System.out.println("down"); break;
			case "left":
				System.out.println("left"); break;
			case "right":
				System.out.println("right"); break;
			default:
				System.out.println("nope");
		}
	}

	// 根据参数指定的枚举类型，输出内容
	public static void test2(DirectionEnum de) {
		switch(de) {
			case UP:
				System.out.println("up"); break;
			case DOWN:
				System.out.println("down"); break;
			case LEFT:
				System.out.println("left"); break;
			case RIGHT:
				System.out.println("right"); break;
			default:
				System.out.println("nope");
		}
	}

	public static void main(String[] args) {
		
		// 自定义类在switch结构中的使用
		DirectionUseTest.test1(Direction.UP.getDesc());

		// 枚举类switch结构中的使用
		DirectionUseTest.test2(DirectionEnum.UP);
	}
}
