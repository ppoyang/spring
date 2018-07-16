package com.wind.s10;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET) //@RequestMapping("/") 같은거
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/board/view") //url이 이렇게 들어왔을대 return 값 으로 연결
	public String view(Model model) { //Model은 스프링에서 이미 가지고있는 클래스
		model.addAttribute("id",20);
		model.addAttribute("name","ABC");
		System.out.println(model);
		return "board/view";
	}
	
	//board/content
	//board/reply
	
	@RequestMapping("/board/ct")
	public	String content(Model model) {
		model.addAttribute("id",10);
		return "board/content";
	}
	
	@RequestMapping("board/re")
	public ModelAndView reply() {
		ModelAndView mv = new  ModelAndView();    //그냥 모델쓰자 똑같..
		mv.addObject("id",15);
		mv.addObject("name","Wind");
		mv.setViewName("/board/reply");
		return mv;
	}
	
	
}
