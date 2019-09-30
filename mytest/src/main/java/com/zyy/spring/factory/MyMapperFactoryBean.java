package com.zyy.spring.factory;

import com.zyy.spring.dao.StudentMapper;
import com.zyy.spring.handler.MyMapperInvocationHandler;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * MyMapperFactoryBean
 *
 * @author zhougf
 * @date 2019/9/30
 */
public class MyMapperFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		Class c = StudentMapper.class;
		ClassLoader classLoader = c.getClassLoader();
		MyMapperInvocationHandler myMapperInvocationHandler = new MyMapperInvocationHandler();
		return Proxy.newProxyInstance(classLoader, new Class[] {c}, myMapperInvocationHandler);
	}

	@Override
	public Class<?> getObjectType() {
		return Object.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
