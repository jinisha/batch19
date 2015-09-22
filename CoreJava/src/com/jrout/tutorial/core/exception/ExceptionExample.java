package com.jrout.tutorial.core.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		String name = null;
		System.out.println("Started the program...");

		int calcValue = 0;
		int b = 0;

		/*
		 * try{ b = Integer.parseInt(args[1]); }catch(Exception exp) { b = 4; }
		 */

		try {
			calcValue = 10 / a;
//			b = Integer.parseInt(args[1]);
			System.out.println("Finished calculation...");

		} catch (ArithmeticException ae) {
			calcValue = 6;
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			b = 8;
		} catch (Exception exp) {
			exp.printStackTrace();
			calcValue = 6;
		}finally{
			System.out.println("THis is my finally block...");
		}
		
		try{
			//dsfsfsdsf
		}finally{
			// close the connection
		}
		
		int secondValue = calcValue + b;
		
		System.out.println("Final Value after division is =" + calcValue);
		System.out.println("Second Value = " + secondValue);

		int age = 13 + calcValue;
		System.out.println("Final Age = " + age);
		System.out.println("Program Exited...");
	}
}