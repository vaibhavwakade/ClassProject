package com.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.Employee;
import Entity.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
    	
    	 Configuration cfg=new Configuration();
    	 Session s = cfg.configure().buildSessionFactory().openSession();
    	 
    	 Transaction tx = s.beginTransaction();
    	 
    	Employee e=new Employee();
    	e.setId(1);
    	e.setName("vaibhav");
    	Date d1=new Date(2024-1900,11-1,07);
    	e.setDoj(d1);
    	
    	
    	Employee e2=new Employee();
    	e2.setId(2);
    	e2.setName("sarthak");
    	Date d2=new Date(2024-1900,8-1,03);
    	e2.setDoj(d2);
    	
    	List<Employee>l1=new ArrayList<>();
    	l1.add(e2);
    	l1.add(e);
    	
    	
    	Manager m =new Manager();
    	
    	m.setCount(555);
    	m.setExp(4);
    	m.setName("bhaiya");
    	m.setId(101);
    	
    	e.setMg(m);
    	e2.setMg(m);
    	
    	List<Employee> l2=new ArrayList<>();
    	l2.add(e2);
    	
    	m.setEmp(l2);
    	
  	Manager manager = s.get(Manager.class, 101);
   	System.out.println(manager.getCount());
    	
    	
    	s.save(e);
    	s.save(e2);
    	s.save(m);
  
    	tx.commit();
    	s.close();
    	
    	
    	

    	
    	
          	
    	
    	
    	 
    }
}
