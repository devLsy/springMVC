package com.lsy.springMVC.dao;

import com.lsy.springMVC.vo.MemberVO;

public interface MemberDAO {

	public boolean loginCheck(MemberVO memberVO);	// 로그인 체크
//	public MemberVO viewMember(MemberVO memberVO);	// 로그인 회원 정보
}
