package com.proje.db.iimpl;

import com.proje.db.DBConnection;

public class OracleDBConnectionImpl implements DBConnection {

	public void openConnection() {
		// TODO Auto-generated method stub
		System.out.println("Oracle bağlandı");
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		System.out.println("Oracle kapandı");
	}

}
