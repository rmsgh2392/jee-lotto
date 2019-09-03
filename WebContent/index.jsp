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
<h1>로또 프로그램</h1>
<form id=lotto_form action="<%=request.getContextPath()%>/lotto.do">
 	입금액<input type="text" name="money" value="2000"/>
 		<input type="submit" value="입금"/>
</form>
<script>
$('#lotto_form').submit(function(){
	alert('테스트완료');
});
</script>
</body>
</html>