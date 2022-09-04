package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.AppConfig;

import cm.proje.db.Database;



public class TestAnnotaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConfigurableApplicationContext  configurableApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		 Database dbconnection=configurableApplicationContext.getBean(Database.class);
		 
		 dbconnection.openConnection();
		 dbconnection.closeConnection();
		 configurableApplicationContext.close();
	}

}
