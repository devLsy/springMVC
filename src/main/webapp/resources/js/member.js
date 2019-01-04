/**
 * 회원관련 js 부분 
 */

$(document).ready(function() {
	var $btnLogin = $("#btnLogin");
	
		$btnLogin.click(function() {
//				console.log("로그인 버튼 클릭함");
				var userId = $("#userId").val();
				var userPw = $("#userPw").val();
				
				alert("userId: " + userId + "\n" + "userPw: " + userPw);
				// id check
				if(userId == "" || userId == null) {
						alert("아이디를 입력 해주세요.");
						$("#userId").focus();
						return false;	
				}
				// pw check	
				if(userPw == "" || userPw == null) {
					alert("비밀번호를 입력 해주세요.");
					$("#userPw").focus();
					return false;
				}	
				document.form1.action="loginCheck.do";
				alert("form data submit");
				document.form1.submit();
		});
});	