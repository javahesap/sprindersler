package com.proje.db;

public class DbConnection {
	
	
	private Database database;
	
	public void openConnection() {
		
		System.out.println("Url :"+this.database.getUrl());
		System.out.println("username :"+this.database.getUsername());
		System.out.println("Passwoerd :"+this.database.getPassword());
		
		
		
		System.out.println("Bağlantı yapıldı");
		
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
