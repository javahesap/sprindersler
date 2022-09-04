package cm.proje.db;

import java.util.List;

public class DbConnection {
	
	
	private String url;
	private String username;
	private String password;
	private List<String> properties;
	
	
	
	private void validation() {
		
		
		if(this.url ==null || this.username==null) {
			
			System.out.println("Hata X");
			
			throw new NullPointerException("hatalý deðerler girilid");
			
			
			
		}else {
			
			System.out.println("doðru");
		}
	}
	
		
	public List<String> getProperties() {
		return properties;
	}


	public void setProperties(List<String> properties) {
		this.properties = properties;
	}


	public DbConnection() {
		
	}
	
	
	public DbConnection(String url, String username, String password) {
		super();
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

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public void openConnection() {
		System.out.println(""+url);
		System.out.println("username"+username);
		System.out.println("password"+password);
		
	}
	
	private void closeConnection() {

		
		System.out.println("Baðlantý alatýldý");
		
		
	}


	@Override
	public String toString() {
		return "Database [url=" + url + ", username=" + username + ", password=" + password + ", properties="
				+ properties + "]";
	}
	

}
