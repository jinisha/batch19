package com.jrout.tutorial.core.enumExample;


//LARGE , MEDIUM , SMALL;

/*class Constants {
	public static final int MONDAY = 1;
	public static final int TUE = 2;
	public static final int WED = 3;
}*/
public class EnumClient {
	
	public static void main(String[] args) {
		printDays(Day.TUE);
	
		/*CoffeeShop cs = new CoffeeShop();
		cs.serveCoffee(Coffee.LARGE);*/
	
	}
	
	public static void printDays(Day day){
		if(day == Day.MON) {
			System.out.println("MONDAY");
		}else if(day == Day.TUE) {
			System.out.println("TUE");
		}else if(day == Day.WED) {
			System.out.println("WED");
		}else if(day == Day.THUR) {
			System.out.println("THUR");
		}else if(day == Day.FRI) {
			System.out.println("FRI");
		}else if(day == Day.SAT) {
			System.out.println("SAT");
		}else if(day == Day.SUN) {
			System.out.println("SUN");
		}else{
			System.out.println("NO SURE which day it is");
		}
	}
}


