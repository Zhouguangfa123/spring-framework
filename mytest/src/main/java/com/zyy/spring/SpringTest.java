package com.zyy.spring;


import com.zyy.spring.bean.Student;
import com.zyy.spring.config.MyConfig;
import com.zyy.spring.dao.StudentMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * com.zyy.spring.SpringTest
 *
 * @author zhougf
 * @date 2019/09/28
 */
public class SpringTest {
	public static void main(String[] args) {
//		String path = "xml/student.xml";
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
//		applicationContext.getBean("stu");
//	    Student student = (Student) applicationContext.getBean("stu");
//		System.out.println(student.getAge());
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Student student = (Student)annotationConfigApplicationContext.getBean("stu");
		StudentMapper studentMapper = (StudentMapper)annotationConfigApplicationContext.getBean("studentMapper");

	}
}
