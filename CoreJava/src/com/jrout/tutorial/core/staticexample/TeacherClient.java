package com.jrout.tutorial.core.staticexample;

public class TeacherClient {
	
	public static void main(String arg[]) {
//		MathUtil mu = new MathUtil();
//		int val = mu.add(2, 4);
		
		MathUtil.add(2, 3);
		TeacherClient tc = new TeacherClient();
		tc.callMe();
		
		TeacherClient.callMe();
	}
	
	public static void callMe(){
		
	}
}
