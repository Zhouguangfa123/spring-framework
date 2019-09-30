package com.zyy.spring.register;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * MyprocessFactory
 *
 * @author zhougf
 * @date 2019/9/30
 */
@Component
public class MyprocessFactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition orderService = (GenericBeanDefinition)beanFactory.getBeanDefinition("stu");
		orderService.setScope(ConfigurableBeanFactory.SCOPE_SINGLETON);
		System.out.println("->>>>:xxx");
	}
}
