package com.wood.test;

import com.wood.dal.config.DataSourceConfig;
import com.wood.dal.config.MybatisConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceConfig.class, MybatisConfig.class})
public abstract class BaseTest {
}
