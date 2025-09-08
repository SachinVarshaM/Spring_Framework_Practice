package com.sm.DemoSpring12th;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("CollectionConfig.xml");
    	DemoCollection demo=context.getBean("cdemo",DemoCollection.class);
        System.out.println( demo.getList().getClass() );
    }
}
