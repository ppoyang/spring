<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>vetslist.jsp</title>
</head>
<body>

vetslist.jsp

<table width="600" cellpadding="0" cellspacing="0" border="1">
   <c:forEach items="${vetslist}" var="dto">
      <tr>
         <td></td>
         <td>${dto.id }</td>
         <td>${dto.first_name }</td>
         <td>${dto.last_name }</td>
      </tr>
      
   </c:forEach>
   
</table>

<p><a href="list">freeboard</a></p>
<p><a href="vetslist">펫클리닛</a></p>
<p><a href="vetselect_view">수의사 전공별 열람</a></p>
<p><a href="vet_add_view">수의사등록</a></p>
<p><a href="vet_add_major">전공 변경</a></p>

</body>
</html>