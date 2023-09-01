package com.busi.ness.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	public MemberVO getList(MemberVO memberVO) throws Exception {
		return memberMapper.getList(memberVO);
		
	}
	
}
