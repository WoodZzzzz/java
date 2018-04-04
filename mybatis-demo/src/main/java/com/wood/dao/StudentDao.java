package com.wood.dao;

import java.util.List;

import com.wood.entity.Student;

public interface StudentDao {

	public List<Student> selectAllStudents();
	public int insertStudent(Student student);
	public int batchInsertStudents(List<Student> studentList);
}
