<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전공선택</title>
</head>
<body>
<form action="tecsel" method="get">  
	<table width="600" cellpadding="0" cellspacing="0" border="1">

	  <tr>
         <td colspan="2"> 전공별 기술자 </td>   
      </tr>
      
      <tr>
      
      
      <td>
      <select name="major_id">
      	<c:forEach items="${tec_view}" var ="dto">
      		<option value="${dto.id}">${dto.cate}</option>
      	</c:forEach>
      </select>
      </td>
      
      <td><input type="submit" value="전공검색"></td>
      
      
     
      </tr>
   

   
</table>
   </form>
</body>
</html>