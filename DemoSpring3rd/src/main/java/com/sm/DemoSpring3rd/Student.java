package com.sm.DemoSpring3rd;

public class Student {
	private int stdRoll;
	private String stdName;
	public int getStdRoll() {
		return stdRoll;
	}
	public void setStdRoll(int stdRoll) {
		this.stdRoll = stdRoll;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "Student [stdRoll=" + stdRoll + ", stdName=" + stdName + "]";
	}
	

}
