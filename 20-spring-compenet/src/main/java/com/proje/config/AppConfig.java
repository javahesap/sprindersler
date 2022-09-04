package com.proje.config;

import com.proje.model.Database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.proje")	
public class AppConfig {
	
	@Bean
public  Database database() {
	
	
	return new Database("mysql:lcalhost","daatbase","url");
}


}
