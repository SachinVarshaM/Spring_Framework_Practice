package com.sm.DemoSpring16th;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
    	Emp emp=context.getBean("info",Emp.class);   // info  is bean name 
         
        emp.name();
    }
}
