package cm.proje.db;

import org.springframework.beans.factory.annotation.Required;

public class DbConnection {
	
	
	private String url;
	private String username;
	private String password;
	
	public DbConnection() {
		
		
	}
	
	
	
	
	public DbConnection(String url, String username) {
		
		this.url = url;
		this.username = username;
		
	}

	public DbConnection(String url, String username, String password) {
	
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}
    @Required
	public void setUrl(String url) {
		this.url = url;
	}
    
    @Required
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

	
	
	public void openConnection() {
		System.out.println(""+url);
		System.out.println("username"+username);
		System.out.println("password"+password);
		
	}
	
	public void closeConnection() {

		
		System.out.println("Baðlantý alatýldý");
		
		
	}
	

}
