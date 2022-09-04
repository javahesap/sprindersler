package com.proje.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConneciton;


public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BeanFactory configruableapplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
       
		DBConneciton dbConnection=(DBConneciton)configruableapplicationContext.getBean("dbConnection");
        dbConnection.openConnection();
        dbConnection.closeConnection();
        
        AbstractApplicationContext abstractAplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        
		
        DBConneciton dbConnection2=(DBConneciton)configruableapplicationContext.getBean("dbConnection",DBConneciton.class);
        dbConnection2.openConnection();
        dbConnection2.closeConnection();
        
          ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml") ;
         DBConneciton dbConnection3=(DBConneciton)applicationContext.getBean("dbConnection");
          
          dbConnection3.openConnection();
          dbConnection3.closeConnection();
          
          ConfigurableApplicationContext configrurableaplicationcontext=new ClassPathXmlApplicationContext("applicationContext.xml") ;
          DBConneciton dbConnection4=(DBConneciton)configrurableaplicationcontext.getBean("dbConnection") ;
          dbConnection4.openConnection();
          dbConnection4.closeConnection();
          
          configrurableaplicationcontext.close();
          
          
	}

}
