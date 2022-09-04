package com.proje.config;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.db.DBConneciton;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ConfigurableApplicationContext configurableaplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
	     DBConneciton dbConnection =configurableaplicationContext.getBean(DBConneciton.class);
	     dbConnection.closeConnection();
	     dbConnection.openConnection();
	     

	}

}
