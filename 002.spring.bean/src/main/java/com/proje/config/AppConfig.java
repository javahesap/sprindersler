package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConneciton;
@Configuration
public class AppConfig {
	@Bean
	public DBConneciton dbConnevtionMethod() {
		
		
		DBConneciton dbConnection=new DBConneciton();
		return dbConnection;
	}

}
