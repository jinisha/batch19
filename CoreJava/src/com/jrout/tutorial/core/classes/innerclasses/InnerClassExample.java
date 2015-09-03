package com.jrout.tutorial.core.classes.innerclasses;

public class InnerClassExample {

	public static void main(String[] args) {
		SteelHouse sh = new SteelHouse();
		//SteelHouse$SteelBathRoom
//		SteelHouse.SteelKitchen sk = new SteelHouse().new SteelKitchen();
		SteelHouse.SteelKitchen sk = sh.new SteelKitchen();
		
		SteelHouse.SteelBathRoom sbr = new SteelHouse.SteelBathRoom();

	}

}
