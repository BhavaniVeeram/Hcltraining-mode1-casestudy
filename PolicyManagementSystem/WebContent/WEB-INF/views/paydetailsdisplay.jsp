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
	.button{
		background-color: purple;
		border: none;
		color: white;
		text-align: center;
		text-decoration: none;
		display: inline-block;
		font-size: 16px;
		padding: 16px;
		border-radius: 8px;
	}
	input{
		border: none;
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
    </nav><br><br>
	<br>
		<div>
		<section class="policysect">
			<f:form action="#" method="post" modelAttribute="policyId">
				<b>Policy Id : </b><f:input path="policyId"/><br><br>
				<b>Bill Date : </b><f:input path="billDate"/><br><br>
				<b>Payment Amount : </b><f:input path="paymentAmount"/><br><br>
				<b>Fine : </b><f:input path="fine"/><br><br>
				<b>Due Date : </b><f:input path="dueDate"/><br><br> 
				
			</f:form>
			<a href="proceedpayment?policyId=${policyId}" ><input type="button" value="Proceed payment" class="button" ></a>
			
		</section>
	</div>
	
</body>
</html>