package com.sm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HController {
	
	@RequestMapping("/about")
	public String about(@RequestParam("val") int a, Model m)
	{
		m.addAttribute("sqr",(a*a));
		m.addAttribute("Cube", (a*a*a));
		return "about";
	}
	@RequestMapping("/index")
	public String about()
	{
		 
		return "index";
	}
	

}
