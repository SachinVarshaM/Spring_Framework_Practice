package com.sm.DemoSpring16th;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.sm.DemoSpring16th")
public class ConfigClass {
	@Bean   // if we use bean annotation need to update bean name as method name. 
	public Emp info()
	{
		
		return new Emp();
	}

}
