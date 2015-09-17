package com.jrout.tutorial.core.inheritance.abstractexample.one;

public class Kangaroo extends Animal {

	@Override
	public void color() {
		System.out.println("Color is gray brown");
	}
	@Override
	public void numberOfLegs() {
		System.out.println("Kang has two legs");
	}
}
