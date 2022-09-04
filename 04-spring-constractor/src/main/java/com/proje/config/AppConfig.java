package com.proje.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cm.proje.db.DbConnection;

@Configuration
public class AppConfig {
	
	@Bean
	public DbConnection dbConnectionMethod() {
		
		DbConnection dbConnection=new DbConnection("besir","deli");
		return dbConnection;
		
	}

}