package com.proje.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.proje.model.Database;

@Configuration
@PropertySources({
	
	@PropertySource("classpath:db.properties")	
	
})

public class AppConfig2 {
	@Autowired
private Environment enviroment;

@Bean
public Database database() {
	
	
	String url=this.enviroment.getProperty("url");
	String username=this.enviroment.getProperty("usrname");
	String password=this.enviroment.getProperty("password");
	
	
	Database databse=new Database(url,username,password);
	
	return databse;
	
}
}
