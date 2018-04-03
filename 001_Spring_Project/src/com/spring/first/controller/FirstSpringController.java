package com.spring.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FirstSpringController {
	@RequestMapping("/hi")
	public String sayHello() {
		return "mm";
	}

	@RequestMapping("/message")
	public String sendMessage(Model m)
	{
		m.addAttribute("myMessage","Hello from controller");
		return "kitchen";
	}
	
	@RequestMapping("/supermessage")
	public ModelAndView sendMess(ModelAndView mv)
	{
		mv.addObject("food","hello from model and view");
		mv.setViewName("canteen");
		return mv;
		
	}

}
