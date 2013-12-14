package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/game")
	public String game(@RequestParam("word")String word, ModelMap model)
	{
		
		model.addAttribute("word", word);
		
		return "game";
	}
	
}
