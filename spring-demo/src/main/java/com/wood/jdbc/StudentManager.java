package com.wood.jdbc;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentManager {

	private JdbcTemplate jdbcTemplate;

	private static StudentManager instance = new StudentManager();

	public static StudentManager getInstance() {
		return instance;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean addStudent(Student student) {
		try {
			jdbcTemplate.update(
					"insert into student values(null,?,?,?)",
					new Object[] { student.getStudentAge(),
							student.getStudentAge(), student.getStudentAge() },
					new int[] { Types.VARCHAR, Types.INTEGER, Types.VARCHAR });
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean deleteStudent(int id) {
		try {
			jdbcTemplate.update("delete from student where studentId = ?",
					new Object[] { id }, new int[] { Types.INTEGER });
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<Student> getStudents() {
		List<Map<String, Object>> resultList = jdbcTemplate
				.queryForList("select * from student");
		List<Student> studentList = null;
		if (resultList != null && !resultList.isEmpty()) {
			studentList = new ArrayList<Student>();
			Map<String, Object> map = null;
			for (int i = 0; i < resultList.size(); i++) {
				map = resultList.get(i);
				Student student = new Student((Integer) map.get("studentId"),
						(String) map.get("studentName"),
						(Integer) map.get("studentAge"),
						(String) map.get("studentPhone"));
				studentList.add(student);
			}
		}
		return studentList;
	}
}
