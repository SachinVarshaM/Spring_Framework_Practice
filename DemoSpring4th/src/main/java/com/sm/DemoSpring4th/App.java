package com.sm.DemoSpring4th;

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
    	A a=(A) context.getBean("a1");
        System.out.println( a.getX() );
        System.out.println(a.getB().getY());
    }
}
