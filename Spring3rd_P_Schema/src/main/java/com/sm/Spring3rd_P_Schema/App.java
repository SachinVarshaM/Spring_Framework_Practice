package com.sm.Spring3rd_P_Schema;

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
      ApplicationContext context= new ClassPathXmlApplicationContext("SpringConfig.xml");
      Employee emp1=(Employee)context.getBean("Emp1");
      
      
      
      System.out.println(emp1);
      
      Employee emp2=(Employee)context.getBean("Emp2");
      System.out.println(emp2);
      
      
      
      
    }
}
