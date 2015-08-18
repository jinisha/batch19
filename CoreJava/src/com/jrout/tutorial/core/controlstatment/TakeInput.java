package com.jrout.tutorial.core.controlstatment;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = scan.next();
		
		System.out.println("Enter Your Address");
		String place = scan.next();
		
		System.out.println("Your Name is " + name + " Address is " + place);
		for(int i = 0 ; i < 10 ; i++) {
			if(i == 5) {
				System.exit(0);
			}
			System.out.println(i);
		}
		/*while(name != "Quit") {
			System.out.println("Enter Your Name");
			name = scan.next();
			System.out.println(name);
		}
		System.exit(0);*/
		// Java Complete Reference
		
	}

}
