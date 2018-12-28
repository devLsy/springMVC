/**
 * 게시판 js 부분 
 */

$(document).ready(function() {
	console.log("page loaded");
	writeBoard();
});	

// 글작성
function writeBoard() {	
	var $btnSave = $("#btnSave");
	
	$btnSave.click(function() {
		var $title = $("#title").val();
		var $id = $("#id").val();	
		var $content = $("#content").val();

		if($title == "" || $title == null) {	
			alert("제목을 입력 해주세요 주인님.");
			$("#title").focus();
			return false;
		}	
		
		if($id == "" || $id == null) {	
			alert("작성자를 입력 해주세요 주인님.");
			$("#id").focus();
			return false;		
		}
		
		if($content == "" || $content == null) {		
			alert("내용을 입력 해주세요 주인님.");
			$("#content").focus();
			return false;	
		}
	});
}