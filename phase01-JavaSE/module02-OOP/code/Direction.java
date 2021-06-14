/**
 * 方向的枚举类
 */


public class Direction {

	private final String desc;	// 用于描述方向的成员变量

	// 2. 声明本类类型的引用，实例化
	public final static Direction UP = new Direction("up");
	public final static Direction DOWN = new Direction("down");
	public final static Direction LEFT = new Direction("left");
	public final static Direction RIGHT = new Direction("right");
	
	// 1. 私有化构造方法 初始化desc
	private Direction(String desc) {
		this.desc = desc;
	}

	// 公有get方法
	public String getDesc() {
		return desc;
	}
	
}
