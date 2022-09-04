package com.project.test;

import com.proje.db.DbConnection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext configruableapplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        DbConnection dbConnection4=(DbConnection)configruableapplicationContext.getBean("veritabani",DbConnection.class);
        dbConnection4.openConnection();
        dbConnection4.closeConnection();
	}

}
