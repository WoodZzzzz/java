package com.wood.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.wood.dao.StudentDao;
import com.wood.entity.Student;

@Repository
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao {
	
	private static final String NAMESPACE = "com.wood.sql.studentMapper.";
	
	//Resource自动装配sqlSessionFactory属性
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public List<Student> selectAllStudents() {
		return getSqlSession().selectList(NAMESPACE + "selectAllStudents");
	}
	
	public int insertStudent(Student student) {
		return getSqlSession().insert(NAMESPACE + "insertStudent", student);
	}

	@Override
	public int batchInsertStudents(List<Student> studentList) {
		return getSqlSession().insert(NAMESPACE + "batchInsert", studentList);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		StudentDao sd = (StudentDao) ctx.getBean("studentDaoImpl");
//		Student s = new Student();
//		s.setStudentName("zz");
//		
//		int j = sd.insertStudent(s);
//		System.out.println(j);
		
		List<Student> insertList = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setStudentName("s1");
		Student s2 = new Student();
		s2.setStudentName("s212312312312123123123");
		insertList.add(s1);
		insertList.add(s2);
		sd.batchInsertStudents(insertList);
		
		List<Student> list = sd.selectAllStudents();
		for (Student st : list) {
			System.out.println(st);
		}
	}

}
