package com.jrout.tutorial.core.inheritance;

public class NonITEmployee extends Employee {
	private int typingExp;

	public NonITEmployee(String name, int empId) {
		super(name, empId);
	}
	public int getTypingExp() {
		return typingExp;
	}
	public void setTypingExp(int typingExp) {
		this.typingExp = typingExp;
	}

}
