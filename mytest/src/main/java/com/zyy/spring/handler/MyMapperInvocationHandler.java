package com.zyy.spring.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MyMapperInvocationHandler
 *
 * @author zhougf
 * @date 2019/9/30
 */
public class MyMapperInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		method.invoke(args);
		return null;
	}
}
