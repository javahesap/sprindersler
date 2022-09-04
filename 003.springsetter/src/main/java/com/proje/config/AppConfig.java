package com.proje.config;

import org.springframework.context.annotation.Bean;

import com.proje.db.DbConnection;

public class AppConfig {
	@Bean
	public DbConnection dbConnectionMethode() {
		
		DbConnection dbConnection=new  DbConnection();
		dbConnection.setPassword("123");		
		dbConnection.setUrl("mysql");
		dbConnection.setUsername("root");
		
		return dbConnection;
		
		
	}

}
