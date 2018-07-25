package com.wind.web.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wind.web.dao.BDao;
import com.wind.web.dto.BDto;


@Controller
public class BController {
	
/*	BService service = null;

	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}	
*/
	
	BDao dao;
	
	@Autowired
	public void setDao(BDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		//service = new BListService();
		//service.excute(model);
		
		//service에서 했던 것들을 컨트롤러에 바로..
		ArrayList<BDto> dtos= dao.list();	
		model.addAttribute("list",dtos);
		return "list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request,  Model model) {
		BDto dto = dao.contentView(request.getParameter("bId"));
		model.addAttribute("content_view",dto);
		//service = new BContentService();
		//service.excute(model);
		return "content_view";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request,  Model model) {
	
		//model.addAttribute("request", request);
		//service = new BWriteService();
		//service.excute(model);
		dao.write(request.getParameter("bName"), 
				request.getParameter("bTitle"), 
				request.getParameter("bContent"));
		return "redirect:list"; //redirect를 쓰게되면 list.jsp가 아니라 위 @RequestMapping("/list")로 가게된다
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		//model.addAttribute("request",request);
		//service = new BDeleteService();
		//service.excute(model);
		dao.delete(request.getParameter("bId"));
		return "redirect:list"; 
	}
	
	@RequestMapping(value = "/modify", method=RequestMethod.POST) //보낼때 post로 보낸다..............용량 크거나 아이다 패스워드같은
	public String modify(HttpServletRequest request, Model model) {
		
		//model.addAttribute("request", request);
		//service = new BModifyService();
		//service.excute(model);
		dao.modify(request.getParameter("bId"), 
				request.getParameter("bName"), 
				request.getParameter("bTitle"), 
				request.getParameter("bContent"));
		return "redirect:list";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {

		//model.addAttribute("request", request);
		//service = new BReplyService();
		//service.excute(model);
		dao.reply(request.getParameter("bId"), 
				request.getParameter("bName"), 
				request.getParameter("bTitle"), 
				request.getParameter("bContent"),
				request.getParameter("bGroup"), 
				request.getParameter("bStep"), 
				request.getParameter("bIndent"));
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		
		
		//service = new BReplyViewService();
		//service.excute(model);
		BDto dto = dao.reply_view(request.getParameter("bId"));
		model.addAttribute("reply_view", dto);
		return "reply_view";
	}
	
	
	///////////////
}
