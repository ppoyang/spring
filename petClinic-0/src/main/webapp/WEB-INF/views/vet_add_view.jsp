<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="600">
	<form action="vet_add" method="get">
		<tr>
			<td width="70">first name</td>
			<td><input type="text" name="first_name" size="50"></td>
		</tr>
		<tr>
			<td width="70">last name</td>
			<td><input type="text" name="last_name" size="50"></td>
		</tr>
		<tr>
			
			<td colspan="2"><input type="submit" value="입력"><a href="vetslist">수의사 목록보기</a></td>
		</tr>
	</form>
</table>

</body>
</html>