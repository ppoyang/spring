package com.wind.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wind.web.service.BContentService;
import com.wind.web.service.BDeleteService;
import com.wind.web.service.BListService;
import com.wind.web.service.BModifyService;
import com.wind.web.service.BReplyService;
import com.wind.web.service.BReplyViewService;
import com.wind.web.service.BService;
import com.wind.web.service.BWriteService;
import com.wind.web.util.Constant;

@Controller
public class BController {
	
	BService service = null;
	/*JDBC추가*/
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}	
	/*JDBC추가*/
	
	@RequestMapping("/list")
	public String list(Model model) {
		service = new BListService();
		service.excute(model);
		return "list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest httpServletRequest,  Model model) {
		
		model.addAttribute("request",httpServletRequest);
		service = new BContentService();
		service.excute(model);
		return "content_view";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request,  Model model) {
	
		model.addAttribute("request", request);
		service = new BWriteService();
		service.excute(model);
		return "redirect:list"; //redirect를 쓰게되면 list.jsp가 아니라 위 @RequestMapping("/list")로 가게된다
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request",request);
		service = new BDeleteService();
		service.excute(model);
		return "redirect:list"; 
	}
	
	@RequestMapping(value = "/modify", method=RequestMethod.POST) //보낼때 post로 보낸다..............용량 크거나 아이다 패스워드같은
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		service = new BModifyService();
		service.excute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("/reply");
		model.addAttribute("request", request);
		service = new BReplyService();
		service.excute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("/reply");
		model.addAttribute("request", request);
		service = new BReplyViewService();
		service.excute(model);
		return "reply_view";
	}
	
	
	///////////////
}
