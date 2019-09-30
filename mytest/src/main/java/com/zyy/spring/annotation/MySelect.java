package com.zyy.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * MySelect
 *
 * @author zhougf
 * @date 2019/9/30
 */
@Target(ElementType.METHOD)
public @interface MySelect {

	String methodName() default "";
}
