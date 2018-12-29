<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="resources/js/board.js"></script>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
</head>
<body>
<h2>게시글 상세보기</h2>
	<form action="getBoardList.do">
		<table style="width:500px; border:1px solid black">
			<tr>
				<td>글번호</td>
				<td>${board.idx}</td>
			</tr>
			<tr>		
				<td>작성자</td>
				<td>${board.id}</td>
			</tr>
			<tr>
				<td>글제목</td>
				<td>${board.title}</td>
			</tr>
			<tr>
				<td>글내용</td>
				<td>${board.content}</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${board.hit}</td>
			</tr>
			<tr>
				<td>날짜</td>
				<td>${board.date}</td>
			</tr>
			<tr>
				<td colspan="2">
					<table>
							<tr>
								<td><button type="button" onClick="location.href='updateBoardFoprm.do?idx=${board.idx}'">글수정</button></td>
								<td><button type="button" onClick="location.href='deleteBoard.do?idx=${board.idx}'">글삭제</button></td>
								<td><button type="button" onClick="location.href='getBoardList.do'">글목록</button></td>
							</tr>	
					</table>
			</tr>
		</table>
	</form>
</body>
</html>