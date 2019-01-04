package com.lsy.springMVC.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// 시작 페이지 변경
	@RequestMapping(value = "/")
	public String main(Model model) {
		model.addAttribute("msg", "홈페이지에 오신것을 환영 합니다.");
		return null;
	// 20190104 22:29 여기까지 함..회원가입부터 다시 구현해볼 것..
	// 참조 블로그: https://doublesprogramming.tistory.com/89 루트 페이지 변경 보는 중..
	}
}	
