/**
 *
 */


public class DirectionEnumTest {

	public static void main(String[] args) {

		// 1. 获取DirectionEnum类中，所有的对象
		DirectionEnum[] des = DirectionEnum.values();

		// 2. 输出每个枚举对象在枚举类型中的名称和索引位置
		for (DirectionEnum de : des) {
			System.out.println("object name: " + de.toString());
			System.out.println("object index: " + de.ordinal());
		}

		System.out.println("----------");
		// 3. 根据参数指定字符串，得到枚举类型的对象
		DirectionEnum de2 = DirectionEnum.valueOf("LEFT");
		System.out.println("转换后的枚举类对象是：" + de2.toString());

		// 4. 判断当前枚举类对象，与参数中枚举类对象定义的先后顺序情况
		//int res = de2.compareTo(des[0]);
		//int res = de2.compareTo(des[3]);
		int res = de2.compareTo(des[2]);
		System.out.println("顺序：" + res);

		System.out.println("----------");
		// 5. 每个DirectionEnum对象，都调用show()方法
		for (DirectionEnum de : des) {
			de.show();
		}
		
	}
}
