package com.wood.bean;

import org.springframework.beans.factory.InitializingBean;

public class InitDestory implements InitializingBean {

	public InitDestory() {
		System.out.println("初始化");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("调用了");
	}

	
}
