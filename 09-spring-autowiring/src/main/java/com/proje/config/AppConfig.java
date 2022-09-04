package com.proje.config;



import com.proje.db.Database;
import com.proje.db.DbConnection;
import com.proje.db.Properties;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="database")
	public Database databse() {
		
	Database database=new Database("mysqllocql","username","1234");	
	return database;
	}
	@Bean(name="properties")
	  public Properties properties() {
			
		  Properties properties=new Properties("min 5 conection","max 100 connection");
			
			
			return properties;
		}
	  
	@Bean(autowire=Autowire.BY_NAME)
	public DbConnection dbConnection() {
		
		DbConnection dbconnection=new DbConnection();
		return dbconnection;
		
	}
 

}
