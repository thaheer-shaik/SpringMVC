package com.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/first")
public class HomeController {

	/*
	 * @RequestMapping("/home") public String home(Model model) {
	 * System.out.println("This is home url");
	 * 
	 * model.addAttribute("name","Thaheer Shaik");
	 * 
	 * return "index"; }
	 */
	
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is a help controller");
	
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("name","Thaheer");
		modelAndView.addObject("rollno",201);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
		
	}	
}
