<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트로또 주식회사</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
</head>
<body>
	<form id="login" action="<%=request.getContextPath()%>/consumer.do">
	아이디<input type="text" /><br/>
	비밀번호<input type="text" /><br/>
		<input type="hidden" name="action" value="login"/>
		<input type="hidden" name="dest" value="buy"/>
		<input type="submit" value="전송"/>
	</form>
	
<script>
$('#login').submit(function(){
	alert('연결성공');
});
</script>
</body>
</html>