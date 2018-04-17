package com.wood.test.dal;

import com.wood.dal.dao.Student;
import com.wood.dal.dao.StudentExample;
import com.wood.dal.dao.StudentMapper;
import com.wood.test.BaseTest;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class StudentMapperTest extends BaseTest {

    private final static Logger log = LoggerFactory.getLogger(StudentMapperTest.class);
    @Autowired
    private StudentMapper mapper;

    @Autowired
    @Qualifier("batchSst")
    private SqlSessionTemplate sqlSessionTemplate;

    @Test
    public void example() {
        StudentExample example = new StudentExample();
        example.setLimitClause("0, 10");
        List<Student> student = mapper.selectByExample(example);
        System.out.println(student.toString());
    }
}
