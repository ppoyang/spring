<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <form action="vetselect2" method="get"> -->  
	<form action="vetselect3" method="get">
	<table width="600" cellpadding="0" cellspacing="0" border="0">

	  <tr>
         <td colspan="2">수의사 전공별 열람</td>   
      </tr>
      
      <tr>
      
      
      <td>
      <select name="specialty_id">
      	<c:forEach items="${vetselect_view }" var ="dto">
      		<option value="${dto.id }">${dto.name}</option>
      	</c:forEach>
      </select>
      </td>
      
      <td><input type="submit" value="전공검색"></td>
      
      
     
      </tr>
   

   
</table>
   </form>
</body>
</html>