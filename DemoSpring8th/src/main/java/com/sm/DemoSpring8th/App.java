package com.sm.DemoSpring8th;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	STD std=(STD)context.getBean("std");
        System.out.println( std );
        std.destroy();
    }
}
