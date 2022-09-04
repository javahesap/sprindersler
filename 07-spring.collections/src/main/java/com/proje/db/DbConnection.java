package com.proje.db;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DbConnection {
	
	private String username;
	private String password;
	private List<String> list;
	private Map<String,String> maps;
	private Properties props;
	
	
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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	
	
	
	public void openConnection() {
		
		System.out.println("Username:"+username);
		System.out.println("\npassword:"+password);
		
		
		System.out.println("List içindekiler");
		for(String ozellik:list) {
			
			System.out.println("\t"+ozellik);
		}
		
		System.out.println("Map içindekiler");
		Set<String> keys=this.maps.keySet();
		
		for(String key:keys) {
			
			System.out.println("\t"+maps.get(key));
		}
		
		System.out.println("props");
		
		Set<String> keysprops=this.props.stringPropertyNames();
           for(String propKey:keysprops) {
			
			System.out.println("\t"+"keyprop"+propKey+this.props.getProperty(propKey));
		}
		
		
		System.out.println("bağlantı yapıldı");
		
	}
	
	public void closeConnection() {
		
		System.out.println("Bağlantı kapatıldı");
		
	}
	
	
	

	
  
}
