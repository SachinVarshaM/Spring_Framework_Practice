package com.sm.DemoSpring13th;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("StereoTypeConfig.xml");
    	Emp emp=context.getBean("emp",Emp.class);  
        System.out.println( emp.getId() );
    }
}
