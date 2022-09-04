package com.project.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.proje.db.DbConnection;
import com.proje.model.Database;

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
