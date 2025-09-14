package com.sm.spring.Spring5th_LifeCycle;


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
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sm/spring/Spring5th_LifeCycle/SpringConfig.xml"); 
         Samosa samosa=(Samosa) context.getBean("s1");
         
         System.out.println(samosa);
         context.registerShutdownHook();
    }
}
