package com.sm.insert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sm.JDBCSpring1st.Emp;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("SpringJDBCConfig.xml");
		  EmpDao empDao=context.getBean("empDao",EmpDao.class);
		  
		  Emp emp=new Emp();
		  emp.setId(1004);
		  emp.setName("Shyam Mane");		   
		  int count=empDao.insert(emp);
		  System.out.println("Number of records inserted.."+count);
		  
		  

	}

}
