package com.sm.CRUD_OPS;

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
    	EmpDao empDao=context.getBean("empDao",EmpDao.class);
    	Emp emp=new Emp();
    	emp.setId(101);
    	emp.setfName("Sachin");
    	emp.setlName("Mane");
    	emp.setEmail("e@e.com");
    	emp.setAge(30);
    	empDao.insert(emp);
        System.out.println( "Hello World!" );
    }
}
