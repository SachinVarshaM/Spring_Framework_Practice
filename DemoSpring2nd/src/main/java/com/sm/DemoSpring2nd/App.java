package com.sm.DemoSpring2nd;

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
    	Emp emp=(Emp)context.getBean("demoEmp");
        System.out.println( "Employee ID : " +emp.getEmpId() );
        System.out.println( "Employee Name : " +emp.getEmpName() );
        System.out.println( "Employee Address : " +emp.getEmpAddress() );
    }
}
