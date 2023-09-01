package com.busi.ness.member;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	public MemberVO getList(MemberVO memberVO)throws Exception;
	
}
