package com.proje.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cm.proje.db.DbConnection;



public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
        
        ConfigurableApplicationContext configruableapplicationContext=new ClassPathXmlApplicationContext("aplicationContext.xml");
        DbConnection dbConnection4=(DbConnection)configruableapplicationContext.getBean("database");
        dbConnection4.openConnection();
        dbConnection4.closeConnection();
        
        
    
        
        
        
        
        
	}

}
