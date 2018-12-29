<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="resources/js/board.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<body>
<h2>게시글 작성</h2>
		<form:form id="form1" action="insertBoard.do" method="post" modelAttribute="boardVO">
			<table style="width:500px; border:1px solid black">
				<form:input type="hidden" path="idx"/>
				<tr>
					<td>글제목</td>
					<td><form:input type="text" id="title" path="title"/></td>
				</tr>
				<tr>	
					<td>작성자</td>		
					<td><form:input type="text" id="id" path="id"/></td>
				</tr>
				<tr>		
					<td>글내용</td>	
					<td><form:textarea style="width: 400px; height: 200px;" id="content" path="content" /></td>
				</tr>
				<tr>
					<td><button id="btnSave">작성</button></td>	
					<td><button type="button" onClick="location.href='getBoardList.do'">글목록</button></td>
				</tr>
			</table>	
		</form>
	</form:form>
</body>
</html>	