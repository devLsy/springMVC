<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="resources/js/member.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginPage</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>login</h2>
	<form name="form1" method="post">
        <table border="1" width="400px">
            <tr>
                <td>아이디</td>
                <td><input name="userId" id="userId"></td>	
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="userPw" id="userPw"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button type="button" id="btnLogin">로그인</button>
                <c:if test="${msg == 'failure'}">
                    <div style="color: red">
                        아이디 또는 비밀번호가 일치하지 않습니다.
                    </div>
                </c:if>
                <c:if test="${msg == 'logout'}">	
                    <div style="color: red">
                        로그아웃되었습니다.
                    </div>
                </c:if>
                </td>
            </tr>
        </table>
    </form>	
</body>
</html>