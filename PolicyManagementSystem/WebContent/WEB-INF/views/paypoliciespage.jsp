<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	a{
		text-decoration: none;
	}
	table{
	
	width: 75%;
	}
	th, td{
	text-align: center;
	padding: 8px;
	border-bottom: 1px solid #ddd;
	}
	tr:nth-child(even) {
		background-color: #f2f2f2;
	}
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
<table >
		<tr class="row">
		<th>Policy Id</th>
		<th>Bill Date</th>
		<th>Payment Amount</th>
		<th>Fine</th>
		<th>Due Date</th>
		<th>Status</th>
		
		</tr>
		<c:forEach items="${policies}" var="p">
			<tr class="row">
			<td>${p.policyId}</td>
			<td>${p.billDate}</td>
			<td>${p.paymentAmount}</td>
			<td>${p.fine}</td>
			<td>${p.dueDate}</td>
			<td><a href="pay?policyId=${p.policyId}" class="pay">Pay</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>