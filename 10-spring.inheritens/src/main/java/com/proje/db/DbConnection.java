package com.proje.db;

import com.proje.model.Database;

public class DbConnection {
	
	
	private Database database;
	private Properties properties;
	
	
	
public void openConnection() {
		
		System.out.println("Url :"+this.database.getUrl());
		System.out.println("username :"+this.database.getUsername());
		System.out.println("Passwoerd :"+this.database.getPassword());
		System.out.println("Properties bilgieri");
		System.out.println("property1 :"+properties.getProperty1());
		System.out.println("property1 :"+properties.getProperty2());
		
		System.out.println("Bağlantı yapıldı");
		
	}
	
	
	
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	
	
	public void closeConnection() {
		
		System.out.println("Bağlantı kapatıldı");
		
	}
	
	
	
	public void setDatabase(Database database) {
		this.database = database;
	}
	
	public Database getDatabase() {
		return database;
	}
	
  
}
