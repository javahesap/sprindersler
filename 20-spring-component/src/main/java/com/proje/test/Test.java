package com.proje.test;



import com.proje.dbConnection.DbConnection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConfigurableApplicationContext applicationcontext=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		
		 DbConnection dbConnection4=(DbConnection) applicationcontext.getBean("DbConnection");
		 
		 dbConnection4.closeConnection();
		 dbConnection4.openConnection();
		
	
		
		 
		 
	}

}
