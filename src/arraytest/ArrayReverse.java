package arraytest;

public class ArrayReverse {

	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77};
		//方法一
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------");
		//方法二
		int arr1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[arr.length - 1 - i];
		}
		for (int i = arr.length - 1,j = 0; i >= 0; i--, j++) {
			arr1[j] = arr[i];
		}
		arr = arr1;
		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr[j]);
		}

	}

}
