package com.sm.DemoSpring9th;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EMP {
	int emiID;

	public int getEmiID() {
		return emiID;
	}

	public void setEmiID(int emiID) {
		this.emiID = emiID;
	}

	@Override
	public String toString() {
		return "EMP [emiID=" + emiID + "]";
	}
	public EMP() {
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Ending Method");
	}

}
