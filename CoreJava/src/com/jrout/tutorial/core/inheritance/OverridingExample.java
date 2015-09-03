package com.jrout.tutorial.core.inheritance;

public class OverridingExample {

	public static void main(String[] args) {
		Employee ie = new ITEmployee("Ishtiaq",34);
		System.out.println("IT EMP : "+ ie.getTieColor());
		
		NonITEmployee nite = new NonITEmployee("Jigs",344);
		System.out.println("NOn IT EMP :"+nite.getTieColor());
	}
}