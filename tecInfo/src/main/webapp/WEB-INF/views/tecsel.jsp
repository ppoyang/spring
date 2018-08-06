<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전공 기술자 명단</title>
</head>
<body>
<c:forEach items="${tecsel2}" var="dto2">
	${dto2.name}, ${dto2.tel} <br/>
</c:forEach>

</body>
</html>