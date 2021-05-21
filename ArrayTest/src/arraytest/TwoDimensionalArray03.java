package arraytest;

public class TwoDimensionalArray03 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];// 给每个一维数组开空间！
			for (int j = 0; j <= i; j++) {
				arr[i][j] = i + 1;
			}
		}
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println("");
		}

	}

}
