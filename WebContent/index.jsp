<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트로또주식회사</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h2>환영합니다</h2>
	<table border='1'>
		<tr>
			<td><strong>로그인</strong></td>
			<td><input id="btn" type="button" value = "LOGIN" /></td>
		</tr>
		<tr>
			<td><strong>고객정보등록</strong></td>
			<td><a id="a_join" href="#">바로가기</a></td>
		</tr>
	</table>





</div>
<script>
$('#btn').click(function(){
	alert('a 바로가기 클릭해!');
	location.assign('<%=request.getContextPath()%>/consumer.do?action=move&dest=login');
});
$('#a_join').click(function(){
	alert('a 바로가기 클릭해!');
	location.assign('<%=request.getContextPath()%>/consumer.do?action=move&dest=join');
});

</script>
</body>
</html>