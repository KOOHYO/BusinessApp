package com.busi.ness;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HomeController {

	@GetMapping(value = "/")
	public ModelAndView main() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
}
