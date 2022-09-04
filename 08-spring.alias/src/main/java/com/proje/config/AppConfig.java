package com.proje.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.proje.db.Database;
import com.proje.db.DbConnection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
		
	
	@Bean
	public DbConnection dbConnection() {
		DbConnection dbconnection=new DbConnection();
	      
		
		
		
		
		return dbconnection;
		
		
		
	}

}
