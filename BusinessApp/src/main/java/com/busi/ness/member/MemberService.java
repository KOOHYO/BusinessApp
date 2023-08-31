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
	
	public Map<String, Object> getList(MemberVO memberVO) throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empNo", memberVO.getEmpNo());
		
		return memberMapper.getList(map);
		
	}
	
}
