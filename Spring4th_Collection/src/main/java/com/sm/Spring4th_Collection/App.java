package com.sm.Spring4th_Collection;

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
      ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
      
      Employee emp=(Employee) context.getBean("mybean1");
      
      System.out.println(emp);
      
      
      
      
    }
}
