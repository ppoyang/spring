<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

loginForm.jsp <br/>

<form action="<c:url value='j_spring_security_check'/>" method="post">
	id: <input type="text" id="j_username" name="j_username"> <br/>
	pw: <input type="text" id="j_password" name="j_password"> <br/>
	<input type="submit" value="전송">
</form>

</body>
</html>