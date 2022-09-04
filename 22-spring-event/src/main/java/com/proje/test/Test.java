package com.proje.test;

import com.proje.publisher.UserSendMailPublisher;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConfigurableApplicationContext applicationcontext=new ClassPathXmlApplicationContext("aplicationContext.xml");
		 
		 UserSendMailPublisher userSendMailPublisher=(UserSendMailPublisher)applicationcontext.getBean("userSendMailPublisher");
		 userSendMailPublisher.userRegisterMessage();
		 applicationcontext.close();
	}

}
