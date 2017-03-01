<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table tr th {
	color: white;
	background-color: black;
}
</style>
</head>
<body>
<table border="1">
<tr>
<th>ID</th><th>NAME</th><th>TYPE</th>
</tr>
<c:forEach items="${loclistobj}" var="loc">
<tr>
<td><a href='editloc?locId=<c:out value="${loc.locId}"/>'><c:out value="${loc.locId}"/></a></td>
<td><c:out value="${loc.locName}"/></td>
<td><c:out value="${loc.locType}"/></td>
<td><a href='deleteloc?locId=<c:out value="${loc.locId}"/>'>delete</a></td>
<%-- <td><a href='editloc?locId=<c:out value="${loc.locId}"/>'>edit</a></td> --%>

</tr>
</c:forEach>

</table>
</body>
</html>





