<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>GET</h3>
	<form action="student"> <!-- 보내는거 method 지정 -->
		student id : <input type="text" name="id"><br/>
		student pw : <input type="password" name="pw">
		<br/><input type="submit" value="확인">
	</form>
	<!-- GET은 url뒤에 파람이 붙는다. -->
	
	<h3>POST</h3>
	<form action="student"  method="post"> <!-- 보내는거 method 지정 -->
		student id : <input type="text" name="id"><br/>
		student pw : <input type="password" name="pw">
		<br/><input type="submit" value="확인">
	</form>
</body>
</html>