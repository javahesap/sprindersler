package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;

import com.proje.db.DbConnection;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConfigurableApplicationContext configurableaplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		DbConnection dbConnection =configurableaplicationContext.getBean(DbConnection.class);
		dbConnection.openConnection();
		dbConnection.closeConnection();
	     

	}

}
