package com.lsy.springMVC.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lsy.springMVC.service.MemberService;
import com.lsy.springMVC.vo.MemberVO;

@Controller
public class MemberController {

	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Resource(name = "memberService")
	private MemberService memberService;
	
	// 회원 목록 조회
	@RequestMapping(value = "/getMemberList.do")
	public ModelAndView getMemberList() {
		List<MemberVO> list = memberService.getMemberList();
		ModelAndView mv = new ModelAndView("jsp/member/list");
		mv.addObject("list", list);
		logger.info("MemberController-getMemberList() completed.");
		return mv;
	}
}
