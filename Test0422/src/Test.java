
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Test {
	public static void main(String[] args) {
		System.out.println(new Max().max(7, 9));
		System.out.println(new Max().max(8.9, 8.8));
		System.out.println(new Max().max(80, 9.5, 8.6));
		
	}
}
