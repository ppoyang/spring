package com.tec.info;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tec.info.dao.IDao;
import com.tec.info.dto.TecDto;
import com.tec.info.dto.TecMajorDto;


@Controller
public class TecController {
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/teclist")
	public String vetslist(Model model) { 
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("teclist", dao.teclistDao());
		return "teclist";
	}
	
	@RequestMapping("/tec_view")
	public String tec_view(Model model) { 
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("tec_view", dao.tec_viewDao());
		return "tec_view";
	}
	
	@RequestMapping("/tecsel")
	public String tecsel(HttpServletRequest request, Model model) { 
		IDao dao = sqlSession.getMapper(IDao.class);
			
		ArrayList<TecMajorDto> dto;
		dto = dao.tecselDao1(Integer.parseInt(request.getParameter("major_id")));
		System.out.println(dto.size());
		ArrayList<TecDto> dto2 = new ArrayList<TecDto>();
		for(int i=0; i<dto.size();i++) {
			dto2.add(dao.tecselDao2(dto.get(i).getTec_id()));
			
		
		}
		model.addAttribute("tecsel2",dto2);
		
		return "tecsel";
	}
}
