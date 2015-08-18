package com.jrout.tutorial.core.controlstatment;

public class IfStatementExample {

	public static void main(String[] args) {

		// int input = Integer.parseInt(args[0]);
		int input = 19;
		String occupation = "Student";
		
//		String output = (input > 18) ? "He is an Adult" : "He is Not an Adult";
//		System.out.println(output);
//		
//		int standard = input - 5;
//		System.out.println("Standard is " + standard);
		String output;
		int standard = 0;
		if(input > 18) {
			output = "He is an Adult";
			standard = standard - 5;
		}else {
			output = "He is Not an Adult";
			standard = standard - 5;
		}
		
		
		if(input > 18 && ("Teacher" == occupation)) {
			output += "\n He/She is a teacher also";
			output += "\n He/She is a teacher also";
		}
		else if(input > 18 && ("Student" == occupation)) {
			
		}else {
			output += "I am tired...";
		}
		
		System.out.println(output);
		
		// System.out.println("He is an Adult");
		// System.out.println("He is Not an Adult");

	}

}
