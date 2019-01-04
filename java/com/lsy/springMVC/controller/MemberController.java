package com.lsy.springMVC.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lsy.springMVC.service.MemberService;
import com.lsy.springMVC.vo.MemberVO;

@Controller
public class MemberController {

	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Resource(name = "memberService")
	private MemberService memberService;
	
	// 로그인 화면
	@RequestMapping(value = "/login.do")
	public String login() {
		return "jsp/member/login";
	}
	
	// 로그인 체크
	@RequestMapping(value ="/loginCheck.do")
	public ModelAndView loginCheck(@ModelAttribute MemberVO memberVO, HttpSession session) {
		boolean result = memberService.loginCheck(memberVO, session);
		ModelAndView mv = new ModelAndView();
		
		if(result == true) { // 로그인 성공
			mv.setViewName("jsp/include/home");
			mv.addObject("msg", "success");		
		} else { // 로그인 실패
			mv.setViewName("jsp/member/login");
			mv.addObject("msg", "failure");
		}
		return mv;
	}
}		
