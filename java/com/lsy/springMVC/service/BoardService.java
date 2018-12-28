package com.lsy.springMVC.service;

import java.util.List;

import com.lsy.springMVC.vo.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList(); 		// 조회
	public int insertBoard(BoardVO boardVO); 	// 등록
	public BoardVO getBoardView(int idx);		// 상세보기
	public int deleteBoard(int idx);					// 글삭제
	public int updateBoard(BoardVO boardVO);	// 글수정
}
