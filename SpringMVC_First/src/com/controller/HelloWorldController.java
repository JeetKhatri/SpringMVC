package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.StudentBean;


@Controller
public class HelloWorldController {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView obj = new ModelAndView("index");
		return obj;
	}
	
	/*@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public ModelAndView welcome(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby){
		
		StudentBean bean  = new StudentBean();
		bean.setStudentHobby(hobby);
		bean.setStudentName(name);
		ModelAndView obj = new ModelAndView("hello");   jsp name : hello
		obj.addObject("student", bean);
		return obj;
	}*/
	
	// above is simple getter setter 
	// or
	// below using model attribute (name must same jsp & bean)
	
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public ModelAndView welcome(@ModelAttribute("student") StudentBean student){
		
		ModelAndView obj = new ModelAndView("hello");   /*jsp name : hello*/
		return obj;
	}
}
