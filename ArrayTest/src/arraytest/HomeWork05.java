package arraytest;

import java.util.Random;

public class HomeWork05 {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[10];
		int sum = 0;
		int maxIndex = -1;
		int minIndex = -1;
		boolean find8 = false;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println("随机数组为：");
		int maxTemp = arr[0];
		int minTemp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(maxTemp <= arr[i]) {
				maxTemp = arr[i];
				maxIndex = i;
			}
			if(minTemp >= arr[i]) {
				minTemp = arr[i];
				minIndex = i;
			}
		}
		System.out.println("");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] < arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		System.out.println("数组倒序打印：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum = arr[i] + sum;
			if(arr[i] == 8) find8 = true;
		}
		System.out.println("");
		System.out.println("平均值为：" + (double)sum/arr.length);
		System.out.println("最大值下标为：" + maxIndex + "  最小值下标为：" + minIndex);
		System.out.println("数组里面是否有8：" + find8);
	}

}
