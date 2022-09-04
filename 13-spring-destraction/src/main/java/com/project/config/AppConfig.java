package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cm.proje.db.DbConnection;

@Configuration
public class AppConfig {
	@Bean(initMethod = "validation", destroyMethod = "closeConnection")
	public DbConnection dbConnectionMethode() {
		
		
		DbConnection	dbconnection =new DbConnection();
		dbconnection.setPassword("12345");
		dbconnection.setUrl("");
		dbconnection.setUsername("rooot");
		
		dbconnection.openConnection();
		
		return dbconnection;
	}

}
