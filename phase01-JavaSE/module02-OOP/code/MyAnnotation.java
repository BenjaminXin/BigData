/**
 *
 */


public @interface MyAnnotation {

	public String value(); default "default value";	// 声明一个String类型的成员变量，不是抽象方法
	public String value2(); default "default value2";
}
