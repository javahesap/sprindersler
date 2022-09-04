package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DbConnection;





public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ConfigurableApplicationContext configurableaplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		 DbConnection dbConnection =(DbConnection)configurableaplicationContext.getBean("dbConnection");
	     dbConnection.closeConnection();
	     dbConnection.openConnection();
	     

	}

}
