package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/helloboot")
	public ModelAndView helloboot() {
		System.out.println("sts3추가문장");
		System.out.println("sts4추가문장22");
		ModelAndView mv = new ModelAndView();
		mv.addObject("model","스프링부트를 시작합니다 - github :)");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("/helloajax")
	@ResponseBody
	public String helloajax() {
		return "{\"model\":\"스프링부트 ajax를 시작합니다.(github)\"}";
	}
	
	
	
}
