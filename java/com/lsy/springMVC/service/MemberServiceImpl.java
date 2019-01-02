package com.lsy.springMVC.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lsy.springMVC.mapper.MemberMapper;
import com.lsy.springMVC.vo.MemberVO;
//MemberService interface의 추상메서드 구현 class
@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	@Resource(name="memberMapper")
	MemberMapper memberMapper;
	
	// 회원 목록 조회
	@Override
	public List<MemberVO> getMemberList() {
		return memberMapper.getMemberList();
	}
}
