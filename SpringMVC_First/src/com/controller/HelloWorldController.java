package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
/*@RequestMapping("/basic")*/  /* if i write here then call as http://localhost:6018/SpringMVC_First/basic/welcome*/
public class HelloWorldController {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView obj = new ModelAndView("index");
		return obj;
	}
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public ModelAndView welcome(@RequestParam("name") String name,@RequestParam("hobby") String hobby){
		ModelAndView obj = new ModelAndView("hello");   /*jsp name : hello*/
		obj.addObject("msg", "welcome "+name+",<br>Your Hobby is "+hobby);
		return obj;
	}
	/*
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public ModelAndView welcome(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("on controller");
		String name = req.getParameter("name");
		String hobby = req.getParameter("hobby");
		ModelAndView obj = new ModelAndView("hello");   jsp name : hello
		obj.addObject("msg", "welcome "+name+" to home page,<br>Your Hobby is "+hobby);
		return obj;
	}*/
	
	@RequestMapping("/hello/{name}")
	public ModelAndView hello(@PathVariable("name") String name){
		ModelAndView obj = new ModelAndView("hello");   /*jsp name : hello*/
		obj.addObject("msg", "Hello "+name);
		return obj;
	}
}
