<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.userloginsect{
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
		<section class="userloginsect">
			<form action="processuserlogin" method="POST">
                <div class="logindiv">
                    <label for="userId">User Id</label>
                    <input type="number" name="userId" required></input>
                </div ><br>
                <div class="logindiv">
                    <label for="password">Password</label>
                    <input type="password" name="password" required/>
                </div><br>
                
                <input type="submit" value="Login" id="userlogin">
                <input type="button" value="Cancel" id ="canceluserlogin"> 
            </form>
		</section>
	<c:out value="${msg}"/>
	</div>
</body>
</html>