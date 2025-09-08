package sm.com.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
    	Student std1=(Student)context.getBean("std");
    	
    	
        System.out.println( "Student ID ="+std1.getStdid() );
        System.out.println( "Student Name ="+std1.getStdname() );
        System.out.println( "Student Adddress ="+std1.getStdaddress() );
        
        //Result using ToString method
        
        System.out.println( "Result ="+std1 );
    }
}
