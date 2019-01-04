package com.lsy.springMVC.dao;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lsy.springMVC.controller.MemberController;
import com.lsy.springMVC.mapper.MemberMapper;
import com.lsy.springMVC.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Resource(name="memberMapper")
	MemberMapper memberMapper;
	
	// 로그인 체크
	@Override	
	public boolean loginCheck(MemberVO memberVO) {
		String name = memberMapper.loginCheck(memberVO);
		logger.info("MemberDAOImpl에서 찍음-로그인한 사용자: " + name);
		return (name == null) ? false : true;	
	}
	// 로그인 사용자 정보
//	@Override
//	public MemberVO viewMember(MemberVO memberVO) {
//		return memberMapper.viewMember(memberVO);
//	}
}
