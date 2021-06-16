package com.exercise;

import java.text.Format;

public class StringBufferExercise {

	public static void main(String[] args) {
		Input i = new Input("MI",2123459.24);
		i.Info();
	}

}

class Input{
	private String name;
	private double price;
	
	public Input(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	private String Insert() {
		String str = new String();
		str = String.valueOf(price);
		System.out.println(str);
		if (0 <= price && price < 1000) {
			return str;
		} else if(price < 0){
			return "价格不能为负数！";
		}else {
			StringBuffer sb = new StringBuffer(str);
			for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
				sb = sb.insert(i ,",");
			}
			return sb.toString();
		}
	}
	
	public void Info() {
		System.out.println(this.name + " " + this.Insert());
	}
}