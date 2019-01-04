<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<a href="getBoardList.do">게시판</a>
<c:choose>
	<c:when test="${sessionScope.userId == null}">
			<a href="login.do">로그인</a>
	</c:when>
	<c:otherwise>
		${sessionScope.userName}님이 로그인중입니다.
		<a href="logout.do">로그아웃</a>
	</c:otherwise>
</c:choose>

<hr>