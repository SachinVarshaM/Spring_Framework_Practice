package com.sm.JDBCSpring9th;

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
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
    	EmpDao empDao=context.getBean("empDao",EmpDao.class);
    	
    	Emp emp=empDao.getEmp(1001);
    	
        System.out.println(emp);
    }
}
