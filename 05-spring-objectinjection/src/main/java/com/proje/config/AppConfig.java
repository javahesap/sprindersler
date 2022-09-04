package com.proje.config;

import com.proje.db.Database;
import com.proje.db.DbConnection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Database database() {
		Database database=new Database("mysqconfdata","root","123321lllllllll");
		return database;
		
	}
	
	@Bean
	public DbConnection dbConnection() {
		DbConnection dbconnection=new DbConnection();
		dbconnection.setDatabase(this.database());
		
		
		return dbconnection;
		
	}

}
