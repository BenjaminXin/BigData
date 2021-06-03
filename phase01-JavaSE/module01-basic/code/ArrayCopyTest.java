/*
 * 数组拷贝
 */



public class ArrayCopyTest {

	public static void main(String[] args) {
		
		// 1. 声明一个初始值为11，22， 33， 44， 55 的int一维数组
		int[] arr1 = {11, 22, 33, 44, 55};
		System.out.println("data of first array: ");
		for(int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		

		System.out.println("----------");
		// 2. 声明一个长度为3 的int一维数组
		int[] arr2 = new int[3];
		System.out.println("data of second array: ");
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("----------");
		// 3. 将第一个数组的中间三个元素，赋值给第二个数组
		for(int i = 1; i <= 3; i++) {
			arr2[i-1] = arr1[i];
		}
		System.out.println("data of second array: ");
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("----------");
		// 4. arraycopy
		System.arraycopy(arr1, 1, arr2, 0, 3); // arraycopy(arr1, position)
		System.out.println("data of second array: ");
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
