package com.sm.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("Collection_Config.xml");
		 Emp emp=(Emp)context.getBean("Emp1");
		 System.out.println(emp.getName());
		 System.out.println(emp.getAddress());
		 System.out.println(emp.getPhone());
		 System.out.println(emp.getCourse());

	}

}
