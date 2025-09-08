package com.sm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AddController {

	@RequestMapping("/add")
	public String  add()
	{
		 
		return "add";
	}
	@RequestMapping("/sub")
	public String sub()
	{
		return "sub";
	}
	@RequestMapping("/division")
	public ModelAndView div(HttpServletRequest req, HttpServletResponse res)
	{
		AddService as=new AddService();
		int a=Integer.parseInt(req.getParameter("txt1"));
		int b=Integer.parseInt(req.getParameter("txt2"));
		int k=as.division(a, b);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("division",k);
		modelAndView.setViewName("div");
		return modelAndView;
	}
}
