package com.jrout.tutorial.core.classes;

public class Client {

	public static void main(String[] args) {
		Ring diamond = new Ring();
		diamond.color = "Transparent";
		diamond.metalType = "Stone";
		diamond.weight = 5;
		
		diamond.printDetails();
	}
}