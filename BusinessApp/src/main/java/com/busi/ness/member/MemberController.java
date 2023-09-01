package com.busi.ness.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		
//		memberVO = memService.getList(memberVO);
//		memberVO = memService.getList(memberVO);
		
//		log.info("=======> 멤버 리스트"+memberVO);
		
//		rtnObj.put("멤버리스트", memberVO);
		
//		Map<String, Object> resultMap = new HashMap<String, Object>();
		memberVO = memService.getList(memberVO);
		
		log.info("=======> 멤버 리스트"+memberVO);
		
		rtnObj.put("멤버리스트", memberVO);
		
		
		return rtnObj;
		
	}
	
}
