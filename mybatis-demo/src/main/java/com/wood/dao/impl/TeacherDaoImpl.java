package com.wood.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.wood.dao.TeacherDao;
import com.wood.entity.Teacher;

@Repository
public class TeacherDaoImpl extends SqlSessionDaoSupport implements TeacherDao {

	private static final String NAMESPACE = "com.wood.sql.teacherMapper.";
	
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public List<Teacher> selectAllTeachers() {
		return getSqlSession().selectList(NAMESPACE + "selectAllTeachers");
	}

	@Override
	public int insertTeacher(Teacher teacher) {
		return getSqlSession().insert(NAMESPACE + "insertTeacher", teacher);
	}

	public static void main(String[] args) {
		
	}
	
}
