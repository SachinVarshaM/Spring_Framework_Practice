package com.sm.JDBCSpring4th;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("JdbcConfig.xml");
    	StudentDao std=context.getBean("std",StudentDao.class);
    	Student s=new Student();
    	s.setRoll(1001);
    	s.setName("Manish Pandye");
    	int r=std.change(s);
        System.out.println( "Number of row inserted :"+r );
        Student s1=new Student();
        s1.setRoll(1003);
        r=std.remove(s1);
        System.out.println( "Number of row deleted :"+r );
    }
}
