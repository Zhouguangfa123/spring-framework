package com.zyy.spring.dao;

import com.zyy.spring.annotation.MySelect;
import com.zyy.spring.bean.Student;

/**
 * StudentMapper
 *
 * @author zhougf
 * @date 2019/9/30
 */
public interface StudentMapper {


	/**
	 * 根据id查询查询学生
	 * @param id 学生id
	 * @return Student 学生对象
	 */
	@MySelect( methodName = "SELECT * FROM wc_user_info")
	Student getStudentById(Long id);
}
