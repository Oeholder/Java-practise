package arraytest;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {24, 69, 80, 57, 13};
		for (int i = arr.length - 1; i > 0; i--) {//for (int i = 0; i < arr.length -  1; i++)
			for (int j = 0; j < i ; j++) {//for (int j = 0; j < arr.length - 1 - i ; j++)
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
