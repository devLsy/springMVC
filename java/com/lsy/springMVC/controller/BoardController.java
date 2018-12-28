package com.lsy.springMVC.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lsy.springMVC.service.BoardService;
import com.lsy.springMVC.vo.BoardVO;

@Controller
public class BoardController {

	private Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Resource(name = "boardService")
	private BoardService boardService;
	
	// 게시글 조회
	@RequestMapping(value = "/getBoardList.do")
	public ModelAndView getBoardList() {
		List<BoardVO> list = boardService.getBoardList();
		ModelAndView mv = new ModelAndView("jsp/list");
		mv.addObject("list", list);
		logger.info("BoardController-getBoardList() completed.");
		return mv;
	}
	
	// 게시글 상세조회
	@RequestMapping(value= "/getBoardView.do", method=RequestMethod.GET)
	public ModelAndView getBoardView(@RequestParam("idx") int idx) {
		ModelAndView mv = new ModelAndView("jsp/view");
		BoardVO board = boardService.getBoardView(idx); 
		mv.addObject("board", board);
		logger.info("BoardController-getBoardView() completed.");
		return mv;
	}
	
	// 게시글 등록 폼 
	@RequestMapping(value= "/insertBoardForm.do")
	public String insertBoardForm(@ModelAttribute("boardVO") BoardVO boardVO) {
		logger.info("BoardController-insertBoardForm() completed.");
		return "jsp/insertForm";
	}
	
	// 게시글 등록 프로세스 
	@RequestMapping(value= "/insertBoard.do", method=RequestMethod.POST)
	public String insertBoard(@ModelAttribute("boardVO") BoardVO boardVO) throws Exception {
		boardService.insertBoard(boardVO);	
		logger.info("BoardController-insertBoard() completed.");
		return "redirect:getBoardList.do";
	}
	// 게시글 삭제
	@RequestMapping(value= "/deleteBoard.do")
	public String deleteBoard(@RequestParam(value="idx") int idx) {
		boardService.deleteBoard(idx);
		logger.info("BoardController-deleteBoard() completed.");
		return "redirect:getBoardList.do";
	}
	// 게시글 수정 폼
	@RequestMapping(value = "/updateBoardFoprm.do", method= {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView updateBoardFoprm(@RequestParam(value="idx")int idx, @ModelAttribute("boardVO") BoardVO boardVO) {
		ModelAndView mv = new ModelAndView("/jsp/update");
		BoardVO board = boardService.getBoardView(idx);
		mv.addObject("boardVO", board);
		logger.info("BoardController-updateBoardForm() completed.");
		return mv;
	}
	
	// 게시글 수정 프로세스
	@RequestMapping(value = "/updateBoard.do", method=RequestMethod.POST)
	public String updateBoard(@ModelAttribute("boardVO") BoardVO boardVO) {
		boardService.updateBoard(boardVO);
		logger.info("BoardController-updateBoard() completed.");
		return "redirect:getBoardList.do";
	}
}