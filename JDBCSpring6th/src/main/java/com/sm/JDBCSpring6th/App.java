package com.sm.JDBCSpring6th;

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
    	StudentDao stdDao=context.getBean("stdDao",StudentDao.class);
    	
    	Student std=stdDao.getStudent(1001);
        System.out.println( "Table Data :\n"+std );
        
        std.setRoll(1);
        std.setName("Golu");
        
        int temp=stdDao.insert(std);
        System.out.println("Inserted records: "+temp);
        
        std.setRoll(0);
        std.setName("Demo1 Mane");
        temp=stdDao.change(std);
        System.out.println("Updated records: "+temp);
        
        
        temp=stdDao.delete(1);
        System.out.println("Deleted records: "+temp);
        
        
        
    }
}
