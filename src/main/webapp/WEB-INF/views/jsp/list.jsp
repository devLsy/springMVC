<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="resources/js/board.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring게시판 게시글 목록</title>
</head>
<body>20181229 14:41 test
<h2>게시글 목록</h2>
</body>
	<input type="button" id="writeBtn" value="글작성" onClick="location.href='insertBoardForm.do'">	
	<table class="bbs" style="width:500px"; border="1px solid black" cellspacing="0">
			<caption>게시판 리스트</caption>
			<colgroup>
				<col width="100">
				<col>
				<col width="110">
				<col width="100">
				<col width="80">	
			</colgroup>
			<thead>		
				<tr>	
					<th scope="col">글번호</th>
					<th scope="col">제목</th>
					<th scope="col">글쓴이</th>	
					<th scope="col">날짜</th>			
					<th scope="col">조회수</th>			
				</tr>	
			</thead>	
			<tbody>	
				<c:forEach items="${list}" var="list">		
						<tr>
							<td class="idx">${list.idx}</td>						
							<td class="title"><a href="getBoardView.do?idx=${list.idx}">${list.title}</a></td>						
							<td class="name">${list.id}</td>						
							<td class="date">${list.date}</td>							
							<td class="hit">${list.hit}</td>						
						</tr>
				</c:forEach>
			</tbody>		
	</table>
</html>