package com.lsy.springMVC.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lsy.springMVC.mapper.BoardMapper;
import com.lsy.springMVC.vo.BoardVO;
// BoardService interface의 추상메서드 구현 class
@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Resource(name="boardMapper")
	private BoardMapper boardMapper;
	// 게시글 조회
	@Override
	public List<BoardVO> getBoardList() {
		return boardMapper.getBoardList();
	}
	// 게시글 등록
	@Override
	public int insertBoard(BoardVO boardVO) {
		return boardMapper.insertBoard(boardVO);
	}
	// 게시글 상세보기
	@Override
	public BoardVO getBoardView(int idx) {
		return boardMapper.getBoardView(idx);
	}
	// 게시글 삭제
	@Override
	public int deleteBoard(int idx) {
		return boardMapper.deleteBoard(idx);
	}
	// 게시글 수정
	@Override
	public int updateBoard(BoardVO boardVO) {
		return boardMapper.updateBoard(boardVO);
	}
	// 조회수 증가
	@Override
	public int updateHit(int idx) {
		return boardMapper.updateHit(idx);
	}
}
