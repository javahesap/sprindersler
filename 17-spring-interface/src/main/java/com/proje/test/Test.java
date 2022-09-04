package com.proje.test;

import com.proje.db.DBConnection;
import com.proje.db.iimpl.MysqlDBConnectionImpln;
import com.proje.db.iimpl.OracleDBConnectionImpl;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConfigurableApplicationContext applicationcontext=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		/*
		 MysqlDBConnectionImpln dbConnection4=(MysqlDBConnectionImpln)configruableapplicationContext.getBean("mysqlDBConnectionImpln");
		 
		 dbConnection4.closeConnection();
		 dbConnection4.openConnection();*/
		
		DBConnection  dbconnection=applicationcontext.getBean("oracleDBConnectionImpl",OracleDBConnectionImpl.class);
		
		dbconnection.closeConnection();
		dbconnection.openConnection();
		
		 
		 
	}

}
