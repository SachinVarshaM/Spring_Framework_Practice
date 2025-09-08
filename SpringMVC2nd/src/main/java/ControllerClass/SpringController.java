package ControllerClass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	
	@RequestMapping("/help")
	public String Help()
	{
		
		return "help";
	}
	
	

}
