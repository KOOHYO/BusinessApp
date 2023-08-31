package com.busi.ness.member;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	public Map<String, Object> getList(Map<String, Object> string)throws Exception;
	
}
