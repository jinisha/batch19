package com.jrout.tutorial.core.lambdaExpression;


public class LambdaExpression {

	public static void main(String[] args) {
		/*Runnable light = new Light();
//		light.start();
		
		Thread lightThread = new Thread(light,"Jayram");
		lightThread.start();*/
		
		/*Runnable whiteLight = () -> {
			System.out.println(Thread.currentThread().getName()+" I m going to light up ur house with White Light");	
		};
		
		Thread whiteLightThread = new Thread(whiteLight,"WhiteLight");
		whiteLightThread.start();
		*/
		/*Calculate calc = new TaxGuy();
		showCalculation(calc);
		
		showCalculation(new Calculate(){
			@Override
			public int calc(int a, int b) {
				return a*b;
			}
		});
*/	
//		Calculate addition = new Add();
//		System.out.println(addition.calc(6, 6));
		
		Calculate calcAdd = (a,b) -> a+b;
		System.out.println(calcAdd.calc(5, 4));
		
		Calculate calcSubs = (a,b) -> a-b;
		System.out.println(calcAdd.calc(5, 4));
		
	}
	
	public static void showCalculation(Calculate calc){
		System.out.println(calc.calc(7, 8));
	}
}