package com.jrout.tutorial.core.exception;

public class CheckedUnchecked {

	public static void main(String[] args) {
		int val = 0;
//		val = calculate(12,0);
		String name = "Jayram";
		
		try {
			int divVal = div(3,0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(DivideException exp) {
			exp.printStackTrace();
		}
		
		/*try {
			val = calculate(12,0);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}*/
		
//		System.out.println(val);
	}
	
	
	public static int calculate(int a , int b) throws ArithmeticException {
		if(b == 0) {
			throw new ArithmeticException("Please enter value more than zero");
		}
		return a/b;
	}
	
	public static int div(int a , int b) throws DivideException {
		if(b == 0) {
			throw new DivideException("Please enter value more than zero");
		}
		return a/b;
	}
}
