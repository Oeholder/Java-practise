package arraytest;

public class YangHui {
	//使用二维数组打印10行杨辉三角
	public static void main(String[] args) {
		int arr[][] = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
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
