package com.proje.db;

public class DbConnection {
	
	private String url;
	private String username;
	private String password;
	public void openConnection() {
		System.out.println("Veri tabanı bağlantısı açıldı deperler ayarlnadı");
		System.out.println(""+url);
		System.out.println(""+username);
		System.out.println(""+password);
	}
	
    public void closeConnection() {
		
		
    	System.out.println("Veri tabanı bağlantısı kapatıldı");
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

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
