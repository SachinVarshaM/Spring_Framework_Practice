package com.sm.JDBCSpring3rd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("JDBCConfig.xml");
    	JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	String query="insert into student(roll,name) values(?,?)";
    	int i=jdbcTemplate.update(query,1005,"Rama Mane");
        System.out.println( i );
        
         
        
    }
}
