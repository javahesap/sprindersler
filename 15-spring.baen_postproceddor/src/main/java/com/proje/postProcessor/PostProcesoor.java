package com.proje.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcesoor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("brandan dsonra ayaraland�ggggggggggggggggggggggggggggggg"+beanName+"bean namme"+bean);
		
		
		return null;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("brandan once ayaraland�yyyyyyyyyyyyyyyyyyyyyyyy"+beanName+"bean namme"+bean);
		return null;
	}

}
