package com.zyy.spring.annotation;

import com.zyy.spring.register.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * MyScaner
 *
 * @author zhougf
 * @date 2019/9/30
 */
@Import(MyImportBeanDefinitionRegistrar.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyScan {
}
