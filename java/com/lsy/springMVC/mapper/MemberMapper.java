package com.lsy.springMVC.mapper;

import java.util.List;

import com.lsy.springMVC.vo.MemberVO;

public interface MemberMapper {

	public List<MemberVO> getMemberList();		// 회원목록 조회
}
