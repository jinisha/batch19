package com.jrout.tutorial.core.classes;

public class SetterGetterExample {

	public static void main(String[] args) {
		Person per = new Person();

		per.setAge(-70); // per.age = -10;
		per.setName("Ramesh"); //per.name = "Ramesh";
		per.setOccupation("Student");//per.occupation = "Student";
		
		System.out.println(per.getAge());

		per.printDetails();
	}

}
