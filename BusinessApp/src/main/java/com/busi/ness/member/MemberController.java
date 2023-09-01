package com.busi.ness.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import groovyjarjarantlr4.v4.parse.ANTLRParser.exceptionGroup_return;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {
	
	@Autowired
	private MemberService memService;
	
	@RequestMapping("/list")
	public @ResponseBody Map<String, Object> getList() throws Exception{
		
		Map<String, Object> rtnObj = new HashMap<>();
		
		MemberVO memberVO = new MemberVO();
		memberVO.setEmpNo("test1");
		
		memberVO = memService.getList(memberVO);
		
		log.info("=======> 멤버 리스트"+memberVO);
		
		rtnObj.put("멤버리스트", memberVO);
		
		
		return rtnObj;
		
	}
	
	@GetMapping("/login")
	public ModelAndView getLogin()throws Exception{
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		
		return modelAndView;
		
	}
	
	@GetMapping("/join")
	public ModelAndView getJoin()throws Exception{
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Join");
		
		return modelAndView;
		
	}
}
