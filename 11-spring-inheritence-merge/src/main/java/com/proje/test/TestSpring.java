package com.proje.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cm.proje.db.Database;



public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
        
        ConfigurableApplicationContext configruableapplicationContext=new ClassPathXmlApplicationContext("aplicationContext.xml");
        Database dbConnection4=(Database)configruableapplicationContext.getBean("mysqldatabase");
       
        System.out.println(dbConnection4);
		System.out.println("--------------------------------------------------");
        
        Database dbConnection=(Database)configruableapplicationContext.getBean("oracle");
    
        
        System.out.println(dbConnection);
        
        
        
        
        
	}

}
