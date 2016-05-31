<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>name</td>
			<td>gender</td>
			<td>country</td>
			<td>skills</td>
		</tr>
		<jstl:forEach items="${employeeList}" var="emp">
			<tr>
				<td>${emp.ename}</td>
				<td>${emp.gender}</td>
				<td>${emp.country}</td>
				<td>${emp.skills}</td>
			</tr>
		</jstl:forEach>
	</table>
	<a href="create">Create new</a>
</body>
</html>