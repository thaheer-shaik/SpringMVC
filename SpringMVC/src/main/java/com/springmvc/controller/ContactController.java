package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
public class ContactController 
{
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	
	/*public String handleForm(
			@RequestParam("email") String userEmail, 
			@RequestParam("userName") String userName, 
			@RequestParam("password") String userPassword, Model model)
	{	
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		
		 * demo of @requestParam without creating model class
		 * 
		 * System.out.println("user email : "+userEmail);
		 * System.out.println("user user name :"+userName);
		 * System.out.println("user password : "+userPassword);
		 * 
		 * model.addAttribute("email",userEmail); 
		 * model.addAttribute("name",userName);
		 * model.addAttribute("password",userPassword);
		 
		 
		
		model.addAttribute("user", user);*/
	
	public String handlerForm(@ModelAttribute User user, Model model)
	{
		System.out.println(user);
		
		this.userService.createUser(user);
		
		return "success";
	}
	

}
