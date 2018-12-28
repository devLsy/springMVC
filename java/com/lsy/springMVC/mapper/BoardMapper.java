package com.lsy.springMVC.mapper;

import java.util.List;

import com.lsy.springMVC.vo.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getBoardList(); 				//  조회
	public int insertBoard(BoardVO boardVO);			// 게시글 등록
	public BoardVO getBoardView(int idx);				// 게시글 상세보기
	public int deleteBoard(int idx);							// 글삭제
	public int updateBoard(BoardVO boardVO);			// 글수정
	public int updateHit(int idx);								// 조회수 증가
}
