package com.sm.DemoSpring6th;

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
       Val val=(Val) context.getBean("val");
       val.doSum();
        
    }
}
