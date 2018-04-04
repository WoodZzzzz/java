package com.wood.dao;

import java.util.List;

import com.wood.entity.Teacher;

public interface TeacherDao
{
    public List<Teacher> selectAllTeachers();
    public int insertTeacher(Teacher teacher);
}