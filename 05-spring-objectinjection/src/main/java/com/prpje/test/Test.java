package com.prpje.test;

import com.proje.db.Database;
import com.proje.db.DbConnection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Database databasen =new Database("mysql","root","123321");
            DbConnection dbConnecton=new DbConnection();
            
            dbConnecton.setDatabase(databasen);
            dbConnecton.openConnection();
            dbConnecton.closeConnection();
            
            
            
	}

}
