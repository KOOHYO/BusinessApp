package com.busi.ness.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	// 회원목록
	public MemberVO getList(MemberVO memberVO)throws Exception;
	
	// 회원가입
	public int setJoin(MemberVO memberVO)throws Exception;
	
}
