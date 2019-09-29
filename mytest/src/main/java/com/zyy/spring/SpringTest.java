package com.zyy.spring;

import com.zyy.spring.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * com.zyy.spring.SpringTest
 *
 * @author zhougf
 * @date 2019/09/28
 */
public class SpringTest {
	public static void main(String[] args) {
		String path = "xml/student.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
	    Student student = (Student) applicationContext.getBean("stu");
		System.out.println(student.getAge());
	}
}
