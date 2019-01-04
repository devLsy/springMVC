package com.lsy.springMVC.service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lsy.springMVC.controller.MemberController;
import com.lsy.springMVC.dao.MemberDAO;
import com.lsy.springMVC.mapper.MemberMapper;
import com.lsy.springMVC.vo.MemberVO;
//MemberService interface의 추상메서드 구현 class
@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Resource(name="memberMapper")
	MemberMapper memberMapper;
	
	@Inject
	MemberDAO memberDAO;
	
	// 로그인 체크
	@Override
	public boolean loginCheck(MemberVO memberVO, HttpSession session) {
		boolean result = memberDAO.loginCheck(memberVO);
		logger.info("MemberServiceImpl에서 찍음-memberDAO에서 받아온 결과값: " + result);
		
		if(result) {  // db조회한 값이 true인 경우에만 세션에 저장
			MemberVO memberVO2 = viewMember(memberVO);
			session.setAttribute("userId", memberVO2.getId());
			session.setAttribute("userName", memberVO2.getName());	
		}
		return result;
	}
		
	// 회원 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO memberVO) {
		return memberMapper.viewMember(memberVO);
	}
}	
