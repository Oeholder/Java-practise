package arraytest;

public class ArrayExercise01 {

	public static void main(String[] args) {
		char ch[] = new char[26];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('A' + i);
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

}
