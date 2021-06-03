/*
 * 数组操作
 */



public class ArrayOperationTest {

	public static void main(String[] args) {
		
		// 1. 声明一个长度为5 的int类型的数组
		int[] arr = new int[5];

		// 输出arr的元素
		for (int i : arr) {
			System.out.println("i = " + i);
		}

		System.out.println("----------");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("i = " + arr[i]);
		}

		System.out.println("----------");
		
		// 2. 赋值
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 11;
		}

		//  遍历输出元素
		for(int i = 0; i < arr.length; i++) {
			System.out.println("i = " + arr[i]);
		}

		System.out.println("----------");
		// 3. 插入55 到0的位置
		//  先元素后移
		for(int j = arr.length-1; j > 0; j--) {
			arr[j] = arr[j-1];
		}
		//  插入55 到0的位置
		arr[0] = 55;

		for(int i : arr) {
			System.out.println("i = " + i);
		}

		System.out.println("----------");
		// 4. 删除55，后续元素前移
		//  55在位置0，直接前移覆盖，末位补0
		for(int i = 1; i <= 4; i++) {
			arr[i-1] = arr[i];
		}
		arr[4] = 0;
		for(int i : arr) {
			System.out.println("i = " + i);
		}

		System.out.println("----------");
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] == 22) {
				arr[i] = 220;
			}
		}
		for(int i : arr) {
			System.out.println("i = " + i);
		}
	}
}
