package com.sm.DemoSpring13th;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//@Component("temp")
public class Emp {
	@Value("1001")
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
