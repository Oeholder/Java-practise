package arraytest;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		//遍历arr数组
		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println(" ");
		}

	}

}
