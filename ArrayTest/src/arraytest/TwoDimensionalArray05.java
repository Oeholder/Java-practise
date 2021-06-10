package arraytest;

public class TwoDimensionalArray05 {
	//遍历二维数组并得到和
	public static void main(String[] args) {
		int arr[][] = {
		{4, 6},
		{1, 4, 5, 7},
		{-2}
		};
		int sum = 0;
		System.out.println("遍历数组：");
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
				sum = is2 + sum;
			}
			System.out.println("");
		}
		System.out.println("二维数组和为：" + sum);
	}

}
