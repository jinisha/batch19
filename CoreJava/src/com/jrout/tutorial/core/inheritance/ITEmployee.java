package com.jrout.tutorial.core.inheritance;

// Is a relationship

public class ITEmployee extends Employee {
	private int programExp;
	
	/*public ITEmployee(){
		super();
	}*/
	
	public ITEmployee(String name, int empId) {
		super(name, empId);
//		System.out.println("ITEmployee.ITEmployee()");
	}

	public ITEmployee(String name, int empId, int programExp) {
		this(name, empId);
	}
	public int getProgramExp() {
		return programExp;
	}
	public void setProgramExp(int programExp) {
		this.programExp = programExp;
	}

	public void callITMethod(){
		System.out.println(super.getEmpId());
	}
	public void callITMethod(String string){
		System.out.println(super.getEmpId() +"");
	}
	
	@Override
	public String getTieColor(){
		return "Black";
	}
}