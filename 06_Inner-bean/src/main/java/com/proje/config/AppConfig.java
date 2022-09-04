package com.proje.config;



import com.proje.db.Database;
import com.proje.db.DbConnection;

import org.springframework.context.annotation.Bean;

public class AppConfig {


	
	@Bean
	public DbConnection dbConnection() {
		Database database=new Database("mysqconfdata","root","123321lllllllll");
		DbConnection dbconnection=new DbConnection();
		dbconnection.setDatabase(database);
		
		
		return dbconnection;
		
	}
}
