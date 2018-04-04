package com.wood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestServlet {

	@RequestMapping(value="/test")
	public String dispatchTest() {
		System.out.println("������test");
		return "redirect:/test.jsp";  //�ض��� 302 Found
	}
	
	@RequestMapping(value="/add")
	public String dispatchAdd(String name, String password) {
		System.out.println("������add");
		return "add";
	}
	
	@RequestMapping(value="/model")
	public String dispatchModel(Model model) {
		model.addAttribute("modelKey", "modelValue");
		System.out.println("model������");
		return "model";
	}
}
