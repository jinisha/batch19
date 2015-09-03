package com.jrout.tutorial.core.classes.innerclasses;

public class SteelHouse {
	String name = "";
	class SteelKitchen {
		public void callKitchen(){
			System.out.println("Hello Kitchen");
		}
	}
	
	static class SteelBathRoom {
		public void callBatchroom(){
			
		}
	}
}