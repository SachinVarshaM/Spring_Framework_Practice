package com.sm.JDBCSpring2nd;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("JdbcConfig.xml");
    	EmpDao empDao=context.getBean("empDao",EmpDao.class);
    	
    	Emp emp=new Emp();
    	emp.setId(1005);
    	emp.setName("Rohan Mane");
    	
    	int count=empDao.insert(emp);
    	
        System.out.println( "Number of records inserted..."+count );
    }
}
