package com.proje.model;

import java.util.List;

public class Database {
	
	
	private String url;
	private String username;
	private String password;
	public void setPassword(String password) {
		this.password = password;
	}


	private List<String> properties;
	
		
	public List<String> getProperties() {
		return properties;
	}


	public void setProperties(List<String> properties) {
		this.properties = properties;
	}


	public Database() {
		
	}
	
	
	public Database(String url, String username, String password) {

		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void password(String password) {
		this.password = password;
	}

	
	
	public void openConnection() {
		System.out.println(""+url);
		System.out.println("username"+username);
		System.out.println("password"+password);
		
	}
	
	public void closeConnection() {

		
		System.out.println("Ba?lant? alat?ld?");
		
		
	}


	@Override
	public String toString() {
		return "Database [url=" + url + ", username=" + username + ", password=" + password + ", properties="
				+ properties + "]";
	}
	

}
