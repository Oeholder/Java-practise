package arraytest;

public class ArrayExercise02 {

	public static void main(String[] args) {
		int nums[] = {4, -1, 9, 56, 10, 23};
		int max = nums[0];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if(max < nums[i]) {
				max = nums[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
