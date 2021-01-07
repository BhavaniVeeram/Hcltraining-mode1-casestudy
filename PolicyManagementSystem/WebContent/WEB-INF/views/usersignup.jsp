<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %> <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.usersignupsect{
	margin: 10px;
	margin-top: 10%;
	margin-left: 40%;
	position: fixed;
	display: block;
}
</style>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div>
		<section class="usersignupsect">
			<f:form action="processusersignup" method="post" modelAttribute="user">
				First Name<f:input path="firstName" required="required"/><br><br>
				Last Name<f:input path="lastName" required="required"/><br><br>
				Age<f:input path="age" required="required"/><br><br>
				Gender 	Male <f:radiobutton path="gender" value="Male"/>  Female <f:radiobutton path="gender" value="Female"/><br><br>
				Contact Number<f:input path="contactNumber" required="required"/><br><br>
				User Id<f:input path="userId" required="required"/><br><br>
				Password<f:input path="password" required="required"/><br><br>
				<input type="submit" value="Submit" id="signup"> 
				<input type="button" value="Cancel" id="cancelusersignup">
			</f:form>
		</section>

	</div>
</body>
</html>