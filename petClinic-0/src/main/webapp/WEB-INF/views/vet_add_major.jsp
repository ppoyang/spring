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

<form action="vet_add_major_mod" method="post">
<!-- 의사정보(Vets - VetsDao) 화면 노출 & 선택-->
<select name="vet_id">
	<c:forEach items="${vetslist}" var="dto1">
		<option value="${dto1.id }"> ${dto1.first_name }, ${dto1.last_name }</option>
	</c:forEach>
</select>

<!-- 전공정보(vet_specialties - VetspecialtiesDao) 화면 노출 & 선택 -->
<c:forEach items="${specialtieslist}" var="dto2">
		<input type="checkbox" id="major" name="major" value="${dto2.id}">
		<label for="specialty_id">${dto2.name }</label>
</c:forEach>

<input type="submit" value="확인">
</form>


</body>
</html>