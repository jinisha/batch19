package com.jrout.tutorial.core.jdbc;

public class Client {

	public static void main(String[] args) {
		HRService service = new HRServiceImpl();
		System.out.println(service.selectQuery(100));
	}
}