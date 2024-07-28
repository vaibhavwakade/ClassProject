package com.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Entity.AmazonLogic;
import com.Entity.Product;


public class App 
{
    public static void main( String[] args )
    {

    	System.out.println("Enter your choice");
    	
    System.out.println("1)Register user");
    
    System.out.println("2)Show all User");
    
    System.out.println("3)Show all Product");
    
    System.out.println("4) Delete user");
    
    Scanner sc =new Scanner(System.in);
    
      int x=sc.nextInt();
      AmazonLogic am =new AmazonLogic();
      
      switch (x) {
	case 1:am.login();
		
		break;
		
	case 2:am.user();
	break;

	case 3:am.product();
	break;
	
	case 4:am.deleteUSer();
	break;


	default:
		break;
	}
    
    	
    
    }
}
