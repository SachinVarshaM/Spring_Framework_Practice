package com.sm.DemoSpring3rd;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	Student std=(Student)context.getBean("std1");
        System.out.println( std );
    }
}
