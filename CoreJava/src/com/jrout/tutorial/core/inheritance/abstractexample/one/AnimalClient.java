package com.jrout.tutorial.core.inheritance.abstractexample.one;

import com.jrout.tutorial.core.inheritance.abstractexample.Apple;
import com.jrout.tutorial.core.inheritance.abstractexample.Running;

public class AnimalClient {

	public static void main(String[] args) {
		Animal blackHorse = new Horse();
		Elephant elep = new AfricanElephant();
		
		printDetails(blackHorse);
		
		Animal whiteHorse = new Horse(){
			@Override
			public void color() {
				System.out.println("Color is White");
			}
		};
		printDetails(whiteHorse);
		
//		printDetails(elep);
		
//		Animal kangaroo = new Kangaroo();
		/*printDetails(new Animal(){
			@Override
			public void color() {
				System.out.println("Kagaroo : Color is gray brown");
			}
			@Override
			public void numberOfLegs() {
				System.out.println("Kangaroo : has 2 legs");
			}
		});*/
		
		Running speedHorse = new Horse();
		speedHorse.run();
		printRunningDetails(speedHorse);
		
		Running runningApple = new Apple("Name","Apple");
		runningApple.run();
		
	}

	public static void printDetails(Animal animal){
		animal.color();
		animal.numberOfLegs();
	}
	
	public static void printRunningDetails(Running runObj){
		runObj.run();
	}
}


