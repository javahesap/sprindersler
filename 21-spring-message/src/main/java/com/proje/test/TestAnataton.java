package com.proje.test;




import java.util.Locale;

import com.proje.config.AppConfig;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnataton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext  configurableApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		String message=configurableApplicationContext.getMessage("failure.login.message", null,Locale.US);
		System.out.println(message);
	}

}
