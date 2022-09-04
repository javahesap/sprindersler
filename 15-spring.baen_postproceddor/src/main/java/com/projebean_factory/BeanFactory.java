package com.projebean_factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactory implements BeanFactoryPostProcessor  {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
		beanFactory.getBeanDefinitionCount();
		
		System.out.println("applicationcontext y�klenirken sayi: "+beanFactory.getBeanDefinitionCount());
	}

}
