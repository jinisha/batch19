package com.jrout.tutorial.core.enumExample;

public class CoffeeShop {
	public void serveCoffee(Coffee coffee){
		if(coffee == Coffee.LARGE){
			System.out.println("Serving Large Coffee");
		}
	}
}