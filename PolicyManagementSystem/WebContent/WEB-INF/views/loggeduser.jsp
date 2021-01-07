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
 <div>
 		<br><br>
        <section class="policysect">
            <form action="searchpolicy">

                    <label for="searchpolicy">Search Policy</label>
                    <input type="text" name="freetext" placeholder="Enter the text to search Policy" >
                    <button>Find</button>
			</form>
        </section>
    </div><br><br>
    
  <a href="paypolicy" ><input type="button" value="Policy payment" class="button" ></a>
  	
</body>
</html>