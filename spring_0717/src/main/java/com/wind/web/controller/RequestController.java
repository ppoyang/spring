package com.wind.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestController {
	
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}
	
	/*@RequestMapping("/student")  //기본은 get방식
	public String goStudent(
			HttpServletRequest httpServletRequest,
			Model model
			) {
			String id = httpServletRequest.getParameter("id");
			String pw = httpServletRequest.getParameter("pw");
			model.addAttribute("studentId",id);
			model.addAttribute("studentPw",pw);
			return "student";
	}*/
	
	//@RequestMapping(value="/student",method=RequestMethod.POST)
	//@RequestMapping(value="/student",method= {RequestMethod.POST,RequestMethod.GET}) //두개 같이 쓸수도 있다.
	@RequestMapping(value="/student") //post방식으로 들어오면 post, get이면 get. 위에거랑 같은거..
	public String goStudent(
			HttpServletRequest httpServletRequest,
			Model model
			) {
			String id = httpServletRequest.getParameter("id");
			String pw = httpServletRequest.getParameter("pw");
			model.addAttribute("studentId",id);
			model.addAttribute("studentPw",pw);
			return "student";
	}

}
