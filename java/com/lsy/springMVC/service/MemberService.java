package com.lsy.springMVC.service;

import javax.servlet.http.HttpSession;

import com.lsy.springMVC.vo.MemberVO;

public interface MemberService {

	public boolean loginCheck(MemberVO memberVO, HttpSession session); // 회원 로그인 체크
	public MemberVO viewMember(MemberVO memberVO);	// 회원 로그인 정보
}
