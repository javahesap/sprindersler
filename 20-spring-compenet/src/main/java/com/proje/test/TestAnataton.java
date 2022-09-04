package com.proje.test;

import com.proje.config.AppConfig;
import com.proje.dbConnection.DbConnection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnataton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext  configurableApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		 DbConnection dbconnection=configurableApplicationContext.getBean(DbConnection.class);
dbconnection.openConnection();
		 
		 configurableApplicationContext.close();
	}

}
