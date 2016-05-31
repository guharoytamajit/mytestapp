<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="employee">
		<table>
			<tr>
				<td>name:</td>
				<td><form:input path="ename" /></td>
				<td><form:errors path="ename"></form:errors></td>
			</tr>
			<tr>
				<td>gender:</td>
				<td>Male:<form:radiobutton path="gender" value="M" /> Female:<form:radiobutton
						path="gender" value="F" /></td>
				<td></td>
			</tr>
			<tr>
				<td>country:</td>
				<td><form:select path="country" items="${countryList}" /></td>
				<td></td>
			</tr>
						<tr>
				<td>skills:</td>
				<td><form:checkboxes path="skills" items="${skillList}" /></td>
				<td></td>
			</tr>
			<%-- 					<tr>
				<td>country:</td>
				<td><form:select path="country" items="${countryList}" /></td>
				<td></td>
			</tr> --%>
		</table>
		<input type="submit" />
	</form:form>
</body>
</html>