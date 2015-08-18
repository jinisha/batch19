package com.jrout.tutorial.core.controlstatment;

public class DoWhile {

	public static void main(String[] args) {
		int n = 10;
		do {
			System.out.println("tick " + n);
			n--;
		} while (n > 0);
		
		/*int count = 10;
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("THis is for Loop "+ i);
		}
		
		int i =0;
		while(i < 10) {
			System.out.println("THis is for Loop "+ i);
			i++;
		}
		
		do {
			System.out.println("THis is for Loop "+ i++);
		} while (i < 10);*/
	}
}