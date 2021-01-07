<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.button{
		background-color: purple;
		border: none;
		color: black;
		text-align: center;
		text-decoration: none;
		display: inline-block;
		font-size: 16px;
		padding: 16px;
		border-radius: 8px;
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
 		<c:out value="${policyId}"/>
		<form action="continue" method="post">
		<input type="hidden" name="policyId" value="${policyId}"></input>	
		Name <input type="text" name="freetext" placeholder="Name" required/><br><br>
	Card Number <input type="number" name="freetext" placeholder="Card Number" required/><br><br>
	Expiry MM <input type="month" required /><br><br>
	Expiry YYYY <input type="number" required /><br><br>
	CVV <input type="number" required /><br><br>
	<button>Verify</button>
	</form>
</body>
</html>