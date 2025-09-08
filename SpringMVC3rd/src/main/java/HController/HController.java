package HController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HController {
	@RequestMapping("/Help")
	public ModelAndView help()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("Name","Sachin");
		modelAndView.addObject("Id",123456);
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
