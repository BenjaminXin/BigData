/**
 *
 */

public enum DirectionEnum implements DirectionInterface {

	// 枚举类型的引用变量，写在最前面
	UP("up") {
		@Override
		public void show() {
			System.out.println("UP 的show方法");
		}
	}, DOWN("down") {
		@Override
		public void show() {
			System.out.println("DOWN 的show方法");
		}
	}, LEFT("left") {
		@Override
		public void show() {
			System.out.println("LEFT 的show方法");
		}
	}, RIGHT("right") {
		@Override
		public void show() {
			System.out.println("RIGHT 的show方法");
		}
	};

	private final String desc;

	private DirectionEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	// 整个枚举类只重写一次，枚举类所有对象都调用同一个方法
	/*
	@Override
	public void show() {
		System.out.println("接口类的抽象方法重写...");
	}
	*/

}
