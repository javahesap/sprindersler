package com.project.test;



import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cm.proje.db.DbConnection;

public class TestSpring {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configruableapplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        DbConnection dbConnection4=(DbConnection)configruableapplicationContext.getBean("dbConnectioncustom");
        dbConnection4.openConnection();
        dbConnection4.closeConnection();
        
        ConfigurableApplicationContext configruableapplicationContext2=new ClassPathXmlApplicationContext("applicationContext.xml");
        DbConnection dbConnection5=(DbConnection)configruableapplicationContext2.getBean("dbConnectioncustom");
        dbConnection5.openConnection();
        dbConnection5.closeConnection();
	}

}
