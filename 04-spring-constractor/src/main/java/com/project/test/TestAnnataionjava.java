package com.project.test;

import com.proje.config.AppConfig;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cm.proje.db.DbConnection;

public class TestAnnataionjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConfigurableApplicationContext  configurableApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		 DbConnection dbconnection=configurableApplicationContext.getBean(DbConnection.class);
		 
		 dbconnection.openConnection();
		 dbconnection.closeConnection();
		 configurableApplicationContext.close();
	}

}
