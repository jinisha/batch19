package com.jrout.tutorial.core.classes;

public class SetterGetterExample {

	public static void main(String[] args) {
		Person per = new Person("Test",23);
		
		per.setAge(70); // per.age = -10;
		per.setName("Ramesh"); //per.name = "Ramesh";
		per.setOccupation("Student");//per.occupation = "Student";
		
		System.out.println(per.getAge());

		per.printDetails();
		
		System.out.println("Initial : "+per.getAddress());
		
		Address add = new Address();
//		add.country = "INDIA";
//		add.pinCode = 753002;
//		add.streetName = "DZone";
		
		per.setAddress(add);
		
		System.out.println("Later : "+per.getAddress());
//		System.out.println(per.getAddress().country);
		
		
		Person raj = new Person("Test",45);
		raj.setAge(30);
		raj.setName("Raj");
		raj.setOccupation("Student");
		
		Address rajAdd = new Address();
//		rajAdd.country = "India";
//		rajAdd.pinCode = 9090;
//		rajAdd.streetName  = "GandhiStreet";
		raj.setAddress(rajAdd);
		
	}
}
