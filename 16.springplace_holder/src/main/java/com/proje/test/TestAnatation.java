package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;
import com.proje.config.AppConfig2;
import com.proje.model.Database;

public class TestAnatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConfigurableApplicationContext applicationcontext=new AnnotationConfigApplicationContext(AppConfig2.class);
		Database databse=applicationcontext.getBean(Database.class);
		
		     System.out.println("url"+databse.getUrl());
	        System.out.println("username"+databse.getUsername());
	        System.out.println("password"+databse.getPassword());
		
	
		applicationcontext.close();
	}

}
