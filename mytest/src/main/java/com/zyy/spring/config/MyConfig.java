package com.zyy.spring.config;

import com.zyy.spring.annotation.MyScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * MyConfig
 *
 * @author zhougf
 * @date 2019/9/30
 */
@Configuration
@ComponentScan("com.zyy.spring")
@ImportResource(locations = "xml/student.xml")
@MyScan
public class MyConfig {

}
