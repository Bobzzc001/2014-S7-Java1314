package com.demo.org.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.org.bean.Student;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping()
	public String index() {
		System.out.println("This is in the index");
		return "index";
	}
	
	/*@RequestMapping("/param")
	public String param(@RequestParam("name")String namesss,String batch,ModelMap result) {
		
		result.addAttribute("name",namesss);
		result.addAttribute("batch",batch);
		
		return "index";
	}*/
	
	@RequestMapping("/param")
	public String param(Student student,ModelMap result) {
		
		result.addAttribute("student",student);
		
		return "index";
	}
	
	@RequestMapping("/param/{name}")
	public String paramrest(@PathVariable("name")String namesss,String batch,HttpServletRequest request) {
		
		System.out.println("name="+namesss);
		System.out.println("batch="+batch);
		
		return "index";
	}
	
	@RequestMapping("/exception")
	public String showException() throws Exception{
		throw new Exception("THis is Exception");
	}
	
}
