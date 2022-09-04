package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cm.proje.db.Database;

@Configuration
public class AppConfig {
	@Bean
	public Database dbConnectionMethode() {
		
		
		Database	dbconnection =new Database();
		dbconnection.setPassword("12345");
		dbconnection.setUrl("httpdpsmosky");
		dbconnection.setUsername("rooot");
		dbconnection.closeConnection();
		dbconnection.openConnection();
		
		return null;
	}

}
