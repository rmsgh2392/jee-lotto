<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또 프로그램</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
</head>
<body>
<h1>회원가입</h1>
<form id=consumer_form  action="<%=request.getContextPath()%>/consumer.do">
	ID<input type="text" name="cid"/><br/>
	PW<input type="password" name="pw"/><br/>
	<input type="hidden" name="action" value="join"/>
	<input type="hidden" name="dest" value="login"/>
	<input type="submit" value="전송"/>
</form>

<script>
$('#consumer_form').submit(function(){
	alert('연결완료!!');
});
</script>
</body>
</html>