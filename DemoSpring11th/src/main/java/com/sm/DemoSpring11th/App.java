package com.sm.DemoSpring11th;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("AutowireAnnotation.xml");
    	Emp emp=(Emp)context.getBean("emp1");
        System.out.println(emp.getAddress());
    }
}
