package com.sm.DemoSpring8th;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class STD implements InitializingBean, DisposableBean {
	private int roll;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "STD [roll=" + roll + "]";
	}

	public void destroy() throws Exception {
		
		 System.out.println("Destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		 System.out.println("Initialization");
		
	}
}
