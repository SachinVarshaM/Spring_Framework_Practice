package com.sm.DemoSpring5th;

public class Student {
	private int roll;
	private String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "roll=" + roll + "  name=" + name + "";
	}
	
	

}
