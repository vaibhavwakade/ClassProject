package com.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AmazonLogic implements AmazonMethod {
	
	@Override
	public void login() {
		Configuration cfg=new Configuration();
		Session s = cfg.configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		

		User us =new User();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the user id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name =sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the MObil number");
		long Mobil =sc.nextLong();
		us.setMobilNo(Mobil);
		us.setAge(age);
		us.setUid(id);
		us.setUname(name);
		s.save(us);
		tx.commit();
		s.close();

		
	}

	@Override
	public void user() {
		Configuration cfg=new Configuration();
		Session s1 = cfg.configure().buildSessionFactory().openSession();
		Transaction tx = s1.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id whic you have to display");
		int uid =sc.nextInt();
		
		User u = s1.get(User.class, uid);
		System.out.println(u.getUid());
		System.out.println(u.getAge());
		System.out.println(u.getUname());
		System.out.println(u.getMobilNo());
		
		s1.close();
		tx.commit();
		
		
		
		
	}

	@Override
	public void product() {

		Configuration cfg=new Configuration();
		Session s2 = cfg.configure().buildSessionFactory().openSession();
		Transaction tx2 = s2.beginTransaction();
		Query query = s2.createQuery("from Product");
		
	  List<Product>l1=query.list();
	  
	  for(Product p:l1) {
		  System.out.println(p.getPid());
		  System.out.println(p.getCost());
		  System.out.println(p.getPtype());
	  
	  s2.save(p);
	  tx2.commit();
		 s2.close();

		
		
	  }
		
	}

	@Override
	public void deleteUSer() {

		Configuration cfg=new Configuration();
		Session s4 = cfg.configure().buildSessionFactory().openSession();
		Transaction tx4 = s4.beginTransaction();
//		Query query = s4.createQuery("delete from User where id =:x");
	Scanner sc =new Scanner(System.in);
		System.out.println("Enter the id which you want to delete");
		int x=sc.nextInt();
//		
// 	query.setParameter("x", x);
//		int row = query.executeUpdate();
//		System.out.println(row+"row affected");
//		
//		tx4.commit();
//		s4.close();
		
		
		User user1 = s4.get(User.class, x);
		s4.save(user1);
		
		
		s4.delete(user1);
		
		tx4.commit();
		
		s4.close();
		
		

		
	}

	

}
