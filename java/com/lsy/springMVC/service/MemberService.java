package com.lsy.springMVC.service;

import java.util.List;

import com.lsy.springMVC.vo.MemberVO;

public interface MemberService {

	public List<MemberVO> getMemberList();		// 회원목록 조회
}
