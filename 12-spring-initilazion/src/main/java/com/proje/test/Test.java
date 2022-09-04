package com.proje.test;

import cm.proje.db.DbConnection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection	dbconnection =new DbConnection();
		dbconnection.setPassword("12345");
		dbconnection.setUrl("httpdpsmosky");
		dbconnection.setUsername("rooot");
		dbconnection.closeConnection();
		dbconnection.openConnection();
		
	}

}
