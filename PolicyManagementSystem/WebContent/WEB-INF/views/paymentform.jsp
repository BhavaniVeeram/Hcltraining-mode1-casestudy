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
	.way{
		color: brown;
		font-weight: bolder;
		
	}
	h1{
		color: olive;
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
	<br><c:out value="${policyId}"/>
	<h1>Select a payment method</h1><br>
	
	<form action="upi" method="post" >UPI <input type="hidden" name= policyId value="${policyId}"><button>CHOOSE</button></form> <br>
	<form action="netbanking" method="post" > Netbanking <input type="hidden" name= policyId value="${policyId}"><button>CHOOSE</button></form> <br>
	<form action="debitcard" method="post" >Debit Card <input type="hidden" name= policyId value="${policyId}"><button>CHOOSE</button></form> <br>
	<form action="creditcard" method="post" >Credit Card <input type="hidden" name= policyId value="${policyId}"><button>CHOOSE</button></form> <br>
	
</body>
</html>