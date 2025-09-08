package com.sm.JDBCSpring7th;

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
    	StudnetDao std=context.getBean("stdDao",StudnetDao.class);
    	Student s=std.getStudent(0);
        System.out.println(s.getName());
    }
}
