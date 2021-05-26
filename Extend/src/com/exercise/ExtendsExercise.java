package com.exercise;

public class ExtendsExercise {

	public static void main(String[] args) {
		PC pc = new PC("Intel-i7", 16, 500, "Lenovo");
		pc.getPCDetail();
		
		NotePad pad = new NotePad("AMD-R5", 4, 256, "银灰色");
		pad.getPadDetail();
		
	}

}
