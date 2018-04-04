package com.wood.service.impl;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wood.dao.StudentDao;
import com.wood.dao.TeacherDao;
import com.wood.entity.Student;
import com.wood.entity.Teacher;
import com.wood.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {
	
	@Resource
	private StudentDao stuDao;
	
	@Resource
	private TeacherDao teaDao;
	
	@Transactional
	public void insertStudAndTeac(Teacher teacher, Student student) {
		stuDao.insertStudent(student);
		teaDao.insertTeacher(teacher);
	}
	
	public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        SchoolService schoolService = 
                (SchoolService)ac.getBean("schoolServiceImpl");
        
        Student student = new Student();
        student.setStudentName("Billy123");
        Teacher teacher = new Teacher();
        teacher.setTeacherName("Luna123123123213123123122131123");
        
        schoolService.insertStudAndTeac(teacher, student);
	}

}
