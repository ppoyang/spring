package com.wind.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HttpRequestController {
	
	//step1
	@RequestMapping("/board/confirm_id")
	public String configId(HttpServletRequest httpServletRequest, Model model) {
		// /board/confirm_id?id=10&pw=1234
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		return "/board/confirm_id";
	}
	//step2
	@RequestMapping("/board/check_id")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		
		return "/board/check_id";
	}
	
	//step3
	/*@RequestMapping("/member/join")
	public String joinData(
			@RequestParam("id") String id,
			@RequestParam("pw") String pw,
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			Model model) {
		
			Member member = new Member();
			member.setId(id);
			member.setName(name);
			member.setPw(pw);
			member.setEmail(email);
			
			model.addAttribute("member",member);
			
			return "/member/join";
	}*/
	
	
	//step4
	/*@RequestMapping("/member/joinsimple")
	public String joinDataSimple(Member member){
		//스프링이 알아서 해준다..
		return "/member/join";
	}*/
	
	
		@RequestMapping("/member/joinsimple")
		public String joinDataSimple(@ModelAttribute("mb") Member member){
			//스프링이 알아서 해준다..
			return "/member/join";
		}
	
	//step5
	@RequestMapping("/member/{memberId}")
	//http://localhost:8181/web/member/dfdf
	public String getMemberId(
				@PathVariable String memberId,
				Model model
			) {	
				model.addAttribute("memberId",memberId);
		return "member/memberView";
	}
}
