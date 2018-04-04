package com.wood.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wood.MybatisUtil;
import com.wood.entity.Student;

/**
 * Hello world!
 * 
 */
public class Test extends MybatisUtil {


	public void selectStudentById(int studentId) {
		SqlSession s = getSqlSession();
		try{
			Student o = s.selectOne("com.wood.sql.testMapper.selectStudentById", 1);
			System.out.println(o);
		} finally {
			s.close();
		}
	}
	
	public void insertStudent(Student student) {
		SqlSession s = getSqlSession();
		try{
			int i = s.insert("com.wood.sql.testMapper.insertStudent", student);
			System.out.println(i);
//			s.commit();
		} finally {
			s.close();
		}
	}
	
	public static void main(String[] args) {
//		Test.selectStudentById(1);
		Student s = new Student();
		s.setStudentId(10);
		s.setStudentName("wwww");
		new Test().insertStudent(s);
	}
}
