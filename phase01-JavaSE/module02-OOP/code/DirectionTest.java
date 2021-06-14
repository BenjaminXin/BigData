/**
 *
 */


public class DirectionTest {

	public static void main(String[] args) {

		// 1. 声明实例化对象
		/*
		Direction d1 = new Direction("up");
		System.out.println("direction: " + d1.getDesc());

		System.out.println("----------");
		Direction d2 = new Direction("down");
		System.out.println("direction: " + d2.getDesc());

		System.out.println("----------");
		Direction d3 = new Direction("left");
		System.out.println("direction: " + d3.getDesc());

		System.out.println("----------");
		Direction d4 = new Direction("right");
		System.out.println("direction: " + d4.getDesc());
		*/

		Direction d1 = Direction.UP;
		Direction d2 = Direction.DOWN;
		Direction d3 = Direction.LEFT;
		Direction d4 = Direction.RIGHT;
		System.out.println("direction: " + d1.getDesc());
		System.out.println("direction: " + d2.getDesc());
		System.out.println("direction: " + d3.getDesc());
		System.out.println("direction: " + d4.getDesc());

		System.out.println("-----------");
		DirectionEnum d5 = DirectionEnum.UP;
		DirectionEnum d6 = DirectionEnum.DOWN;
		DirectionEnum d7 = DirectionEnum.LEFT;
		DirectionEnum d8 = DirectionEnum.RIGHT;
		System.out.println("direction: " + d5.getDesc());
		System.out.println("direction: " + d6.getDesc());
		System.out.println("direction: " + d7.getDesc());
		System.out.println("direction: " + d8.getDesc());
	}
}
