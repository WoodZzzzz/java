package com.wood;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	protected static InputStream in = null;
	protected static SqlSessionFactory sqlSession = null;

	static {
		try {
			in = Resources.getResourceAsStream("mybatis-config.xml");
			sqlSession = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected SqlSession getSqlSession() {
		return sqlSession.openSession();
	}
}
