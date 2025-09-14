package sm.com.DemoSpring1st;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
    	DemoPojo pojo=(DemoPojo)context.getBean("Demo");
        System.out.println( "Result: " +pojo);
    }
}
