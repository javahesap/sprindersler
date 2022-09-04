package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.model.Database;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
        ConfigurableApplicationContext configruableapplicationContext=new ClassPathXmlApplicationContext("aplicationContext.xml");
        Database databse=(Database)configruableapplicationContext.getBean("database");
       
        
        System.out.println("url"+databse.getUrl());
        System.out.println("username"+databse.getUsername());
        System.out.println("password"+databse.getPassword());
        databse.openConnection();
       
        
        
        configruableapplicationContext.close();
		
	}

}
