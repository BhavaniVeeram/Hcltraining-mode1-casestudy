<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
	  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.policysect{
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
            <li class="itemlist"><a href="logout">Logout</a></li>
        </ul>
    </nav>
	<div>
		<section class="policysect">
			<f:form action="processcreatepolicy" method="post" modelAttribute="policy">
				Policy Name<f:input path="policyName" required="required"/><br><br>
				Policy Type<f:input path="policyType" required="required"/><br><br>
				Policy Duration<f:input path="policyDuration" required="required"/><br><br>
				Policy Amount<f:input path="policyAmount" required="required"/><br><br>
				Company Name<f:input path="companyName" required="required"/><br><br>
				<input type="submit" value="Submit" id="createPolicy"> 
				<input type="button" value="Cancel" id="cancelcreate">
			</f:form>
		</section>
	</div>
</body>
</html>