package com.proje.test;

import cm.proje.db.Database;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database	dbconnection =new Database();
		dbconnection.setPassword("12345");
		dbconnection.setUrl("httpdpsmosky");
		dbconnection.setUsername("rooot");
		dbconnection.closeConnection();
		dbconnection.openConnection();
		
	}

}
