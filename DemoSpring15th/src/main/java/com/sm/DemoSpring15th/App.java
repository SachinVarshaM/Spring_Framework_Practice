package com.sm.DemoSpring15th;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpELConfig.xml");
    	Emp emp=context.getBean("emp",Emp.class);
    	System.out.println(emp);
    }
}
