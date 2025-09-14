package com.sm.JDBCSpring8th;

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
    	EmpDao emp=context.getBean("empDao",EmpDao.class);
    	
    	Emp emp1=emp.getEmp(1015);
        System.out.println(emp1.getName());
    }
}
