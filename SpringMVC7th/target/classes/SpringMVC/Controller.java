package SpringMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
public class Controller {

	@RequestMapping("/home")
	public String Home(Model model) {
		
		model.addAttribute("name","Sachin Mane");
		List<String> list=new ArrayList<String>();
		list.add("Sachin Mane");
		list.add("Soham");
		list.add("Sham");
		model.addAttribute("list",list);
		return "index";
	}
	
	@RequestMapping("/Help")
	public String Help( Model model)
	{
		model.addAttribute("name","Varsha Mane");
		return "help";
	}
}
