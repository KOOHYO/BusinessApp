package com.busi.ness.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groovyjarjarantlr4.v4.parse.ANTLRParser.exceptionGroup_return;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	// 회원목록
	public MemberVO getList(MemberVO memberVO) throws Exception {
		return memberMapper.getList(memberVO);
		
	}
	
	// 회원가입
	public int setJoin(MemberVO memberVO)throws Exception{
		return memberMapper.setJoin(memberVO);
	}
	
}
