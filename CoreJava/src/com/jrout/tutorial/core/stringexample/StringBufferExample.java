package com.jrout.tutorial.core.stringexample;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer text = new StringBuffer();
//		StringBuilder text = new StringBuilder();
		text.append("Jayram");
		text.append("Rout");
		text.append("Hello");
		
		try{
			for(int i = 0 ; i < 456 ; i++) {
				text.append(i+"");
			}	
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
		System.out.println(text.append("Jayram"));
		
		try{
			for(int i = 0 ; i < 456 ; i++) {
				text.append(i+"");
			}	
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
}