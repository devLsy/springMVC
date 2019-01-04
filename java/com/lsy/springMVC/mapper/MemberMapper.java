package com.lsy.springMVC.mapper;

import java.util.List;

import com.lsy.springMVC.vo.MemberVO;

public interface MemberMapper {

	public List<MemberVO> getMemberList();		// 회원목록 조회
	public String loginCheck(MemberVO memberVO);	// 로그인 체크
	public MemberVO viewMember(MemberVO memberVO);							// 로그인 사용자 정보
}
