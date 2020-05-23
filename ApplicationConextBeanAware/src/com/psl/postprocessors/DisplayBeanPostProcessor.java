package com.psl.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization..........."+arg1);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization............"+arg1);
		return bean;
	}
	

}
