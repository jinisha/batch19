package com.jrout.tutorial.core.controlstatment;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		int ages[] = { 1, 3, 5, 7, 8, 90 };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = scan.nextInt();

		// for (int age : ages) {

		switch (age) {
		case 1:
			System.out.println("Age is One");
			break;
		case 2:
			System.out.println("Age is Two");
			break;
		case 3: {
			System.out.println("Age is Three");
			System.out.println("I still struggle to speak");
			break;
		}
		case 5:
			System.out.println("Age is Five");
			break;

		default:
			break;
		}

		// }

	}

}
