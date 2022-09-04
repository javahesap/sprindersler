package com.proje.test;

import com.proje.db.DBConneciton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		DBConneciton dbConnection=new DBConneciton();
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		
		
	}

}
