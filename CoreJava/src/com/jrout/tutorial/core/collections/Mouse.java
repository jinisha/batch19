package com.jrout.tutorial.core.collections;

class Mouse implements Comparable {
	private String color;
	private String brand;
	
	public Mouse(String color , String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int compareTo(Object o) {
		Mouse otherMouse = (Mouse)o;
		return this.getColor().compareTo(otherMouse.getColor());
	}
}