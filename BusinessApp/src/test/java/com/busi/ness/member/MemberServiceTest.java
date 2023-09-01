package com.busi.ness.member;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class MemberServiceTest {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	void getList() throws Exception {
		
		MemberVO memberVO = new MemberVO();
		memberVO.setEmpNo("test1");
		memberVO = memberMapper.getList(memberVO);
		
		assertNotNull(memberVO);
		
	}
	
}
