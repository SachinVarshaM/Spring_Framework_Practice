package com.sm.JDBCSpring1st;

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
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringJDBCConfig.xml");
         JdbcTemplate temp=context.getBean("jdbcTemplate",JdbcTemplate.class);
         
         String query="insert into emp(id,name) values(?,?)"; 	
         
         int count=temp.update(query,1002, "Varsha Mane");
         System.out.println("Numbers of Updated Records is ..."+count);
        
    }
}
