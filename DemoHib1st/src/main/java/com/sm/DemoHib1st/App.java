package com.sm.DemoHib1st;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int choice=1;
    	String data=null;
    	int age=0;
    	int id=0;
    	
    	Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        EmpDemo emp=new EmpDemo();
    	
    	
    	 
    		System.out.println("1) Add Employee Data:");
    		System.out.println("2) Update Employee Data:");
    		System.out.println("3) Get Employee Data:");
    		System.out.println("4) Delete Employee Data:");
    		System.out.println("0) Exit");
    		
    		System.out.println("Enter your above choice");
    		Scanner sc=new Scanner(System.in);
    		choice=Integer.parseInt(sc.next());
    		 switch(choice)
    		 {
    		 case 1: System.out.println("Enter Employee ID :");
	         		 id=Integer.parseInt(sc.next());
	                 emp.setId(id);
    			 	 System.out.println("Enter Employee First Name :");
    		 		 data=sc.next();
    			 	 emp.setFirstName(data);
    			 	 System.out.println("Enter Employee Last Name :");
    			 	 data=sc.next();
    		 		 emp.setLastlName(data);
    		 		 System.out.println("Enter Employee Email ID :");
    		 		 data=sc.next();
    		 		 emp.setEmail(data);
    		 		 System.out.println("Enter Employee Age :");
    		 		 age=Integer.parseInt(sc.next());
    		 		 emp.setAge(age);
    		 		 session.save(emp);
    		 	     tx.commit();
    		 		 System.out.println("New Record added\n");  
    		 		 break;  
    		 case 2: System.out.println("Enter Employee ID :");
    		         id=Integer.parseInt(sc.next());
    		         emp.setId(id);
    		         System.out.println("Enter Employee First Name :");
    		         data=sc.next();
    		         emp.setFirstName(data);
    		         System.out.println("Enter Employee Last Name :");
    		         data=sc.next();
    		         emp.setLastlName(data);
    		         System.out.println("Enter Employee Email ID :");
    		         data=sc.next();
    		         emp.setEmail(data);
    		         System.out.println("Enter Employee Age :");
    		         age=Integer.parseInt(sc.next());
    		         emp.setAge(age);
    		         session.saveOrUpdate(emp);
    		         tx.commit();
    		         
    		         System.out.println("Record Updated\n");  
		 		    
    		         break;  
    		 case 3: System.out.println("Enter Employee ID :");
    		    	 id=Integer.parseInt(sc.next());
    		    	 EmpDemo emp2=(EmpDemo) session.get(EmpDemo.class, id);
    	        	 System.out.println("ID :"+emp2.getId() +" First Name :"+emp2.getFirstName()+" Last Name : "+emp2.getLastlName()+" Email ID: "+emp2.getEmail()+" Age : "+emp2.getAge()+"\n");  
    	        	 break;  
    		 case 4: System.out.println("Enter Employee ID :");
    		 		 id=Integer.parseInt(sc.next());
    		 		  EmpDemo emp3= (EmpDemo) session.get(EmpDemo.class, id);
    		 		  session.delete(emp3);
    		 		 tx.commit();
    		 		 System.out.println("Record Deleted\n");  
    		 		 break;   
    		      		  
    		       
    		    default:System.out.println("Please select above options");  
    		 }
    		
    	
        
    
    	 
    	
     
   
    
    
    
    
    
    
    }
}
