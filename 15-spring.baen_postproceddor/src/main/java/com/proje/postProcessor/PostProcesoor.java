package com.proje.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcesoor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("brandan dsonra ayaralandýggggggggggggggggggggggggggggggg"+beanName+"bean namme"+bean);
		
		
		return null;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("brandan once ayaralandýyyyyyyyyyyyyyyyyyyyyyyyy"+beanName+"bean namme"+bean);
		return null;
	}

}
