package com.project.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.postProcessor.PostProcesoor;
import com.projebean_factory.BeanFactory;

import cm.proje.db.DbConnection;

@Configuration
public class AppConfig {
	@Bean(initMethod = "validation", destroyMethod = "closeConnection")
	public DbConnection dbConnectionMethode() {
		
		
		DbConnection	dbconnection =new DbConnection();
		dbconnection.setPassword("12345");
		dbconnection.setUrl("asdsd");
		dbconnection.setUsername("rooot");
		
		dbconnection.openConnection();
		
		return dbconnection;
	}
	
	/*@Bean
	public BeanFactoryPostProcessor beanFactory() {
		BeanFactory beanfacoty	= new BeanFactory();
		
		return  beanfacoty;
	}*/
	@Bean
	public BeanPostProcessor beanPostProcesoor() {
		
		
		return new PostProcesoor();
	}
	
	
	
}
