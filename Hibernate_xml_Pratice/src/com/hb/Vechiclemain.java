package com.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Vechiclemain {
	
	
	public static void main(String[] args) {
		System.out.println("Step 1");
		Configuration cfg=new Configuration();
		cfg.configure();
		
		System.out.println("Step 2");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		System.out.println("3 step");
		Vechicle v1=new Vechicle(101,"audi");
		
	    s.save(v1);
	    
     
		tx.commit();
	    s.close();
		sf.close();
		System.out.println("last step");
		
		
		
		
	}

}
