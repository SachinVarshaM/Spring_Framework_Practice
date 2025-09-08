package com.sm.SpringProps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCLASS {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("PropsConfig.xml");
		Emp emp=(Emp) context.getBean("Emp1");
		System.out.println(emp);
		
		
	}

}
