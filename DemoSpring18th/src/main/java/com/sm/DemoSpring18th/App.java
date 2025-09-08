package com.sm.DemoSpring18th;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	Student std=context.getBean("std",Student.class);
        System.out.println( std );
    }
}
