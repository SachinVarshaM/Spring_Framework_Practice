package com.sm.JDBCSpring5th;

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
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfiguration.class);
    	EmpDaoImpl empDao=context.getBean("empDao",EmpDaoImpl.class);
    	
    	Emp emp=new Emp();
    	
    	emp.setId(1015);
    	emp.setName("Dummy Name");
    	
    	 
    	
    	
        System.out.println(" Inserted Records :"+ empDao.insert(emp) );
    }
}
