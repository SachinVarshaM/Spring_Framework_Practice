package com.sm.DemoSpring7th;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	Emp emp=(Emp)context.getBean("E1");
        System.out.println( emp );
        context.registerShutdownHook();
    }
}
