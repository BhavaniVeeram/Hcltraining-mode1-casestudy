<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
	  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.adminsignupsect{
	margin: 10px;
	margin-top: 10%;
	margin-left: 40%;
	position: fixed;
	display: block;
}
a{
            text-decoration: none;
        }
        
        a:hover{
            color: black;
        }
        .unorderedlist{
            list-style: none;
            
            padding: 20px;    
        }
        .navbar{
            display: block; 
            background-color:aqua; 
            margin: 0px;
            padding: 0px;
            text-align: center;
            
        }
        .itemlist{
            display: inline-block;
            font-family: Georgia, 'Times New Roman', Times, serif;
            width: 150px;
            padding: 10px;
            text-align: center;
            font-size: 25px;
            font-weight: bold;   
        }
        *{
            margin: 0px;
            box-sizing: border-box;
        }

       
</style>
</head>
<body>
    <nav class="navbar">
        <ul class="unorderedlist">
            <li class="itemlist"><a id="home" href="home">Home</a></li>
            <li class="itemlist"><a id="adminlogin" href="adminlogin" >Admin Login</a></li>
            <li class="itemlist"><a id="adminsignup" href="adminsignup" >Admin Registration</a></li>
            <li class="itemlist"><a id="userlogin" href="userlogin" >User Login</a></li>
            <li class="itemlist"><a id="usersignup" href="usersignup" >User Registration</a></li>
        </ul>
    </nav>
    <c:out value="${msg}"/>
	<div>
		<section class="adminsignupsect">
			<f:form action="processadminsignup" method="post" modelAttribute="admin">
				First Name<f:input path="firstName" required="required"/><br><br>
				Last Name<f:input path="lastName" required="required"/><br><br>
				Age<f:input path="age" required="required" /><br><br>
				Gender 	Male <f:radiobutton path="gender" value="Male"/>  Female <f:radiobutton path="gender" value="Female"/><br><br>
				Contact Number<f:input path="contactNumber" required="required"/><br><br>
				Vendor Id<f:input path="vendorId" required="required"/><br><br>
				Password<f:input path="password" required="required"/><br><br>
				<input type="submit" value="Submit" id="signup"> 
				<input type="button" value="Cancel" id="canceladminsignup">
			</f:form>
		</section>
	</div>
	
</body>
</html>