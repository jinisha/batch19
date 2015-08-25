package com.jrout.tutorial.core.variables;

public class VariableExample {
	
	
	public static void main(String[] args) {
		Paper white = new Paper("White", "XYZ");
		Paper orange = new Paper("Orange", "ABC");
		Paper black = new Paper("Black", "ABC");
		
		/*System.out.println(white.color);
		white.count++;
		System.out.println(white.color +" "+ white.count);
		
		System.out.println(orange.color +" "+ orange.count);*/
		System.out.println(Paper.count);
		/*System.out.println(white.count);
		System.out.println(orange.count);*/

	}
}
