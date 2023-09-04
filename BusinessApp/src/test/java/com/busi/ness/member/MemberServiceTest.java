package com.busi.ness.member;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class MemberServiceTest {

	@Autowired
	private MemberService memberService;
	
//	@Test
	void getList() throws Exception {
		
		MemberVO memberVO = new MemberVO();
		memberVO.setEmpNo("test1");
		memberVO = memberService.getList(memberVO);
		
		assertNotNull(memberVO);
		
	}
	
//	@Test
	void setJoin() throws Exception {
		
		MemberVO memberVO = new MemberVO();
		memberVO.setEmpNo("test2");
		memberVO.setDepCd("test2");
		
		int result = memberService.setJoin(memberVO);
		
		assertEquals(result, 1);
		
	}
	
}
