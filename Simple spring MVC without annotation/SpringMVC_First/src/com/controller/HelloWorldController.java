package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("on controller");
		String name = req.getParameter("name");
		ModelAndView obj = new ModelAndView("hello");   /*jsp name : hello*/
		obj.addObject("msg", "welcome "+name+" to home page");
		return obj;
	}
}
