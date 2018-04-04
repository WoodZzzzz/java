package com.wood.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Tiger {

	private String name = "Tiger";
	
	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "TigerName:" + name;
	}
}
