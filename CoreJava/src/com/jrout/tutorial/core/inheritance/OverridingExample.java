package com.jrout.tutorial.core.inheritance;

public class OverridingExample {

	public static void main(String[] args) {
		/*Employee ie = new ITEmployee("Ishtiaq",34);
		System.out.println("IT EMP : "+ ie.getTieColor());
//		ie.getProgramExp(); // THis is not possible

		printMe(ie);
				
		Employee nite = new NonITEmployee("Jigs",344);
		System.out.println("NOn IT EMP :"+nite.getTieColor());
		printMe(nite);*/
		Employee employee = null;
		
		employee = new ITEmployee("Ishtiaq",34);
		showEmployeeDetails(employee);
		
		employee = new NonITEmployee("Jigs",344);
		showEmployeeDetails(employee);
	}
	
	public static void showEmployeeDetails(Object obj){
		System.out.println(((Employee)obj).getEmpId() +" "+ ((Employee)obj).getName());
		
		if(obj instanceof ITEmployee) {
			ITEmployee ite = (ITEmployee)obj;
			System.out.println(ite.getProgramExp());
		}else if(obj instanceof NonITEmployee){
			NonITEmployee nite = (NonITEmployee) obj;
			System.out.println(nite.getTypingExp());	
		}
	}
	
	/*public static void printMe(Employee emp) {
		System.out.println(emp.getName());
	}*/
	
	
}