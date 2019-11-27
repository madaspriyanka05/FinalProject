<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
	<title>JAN DHAN BANK</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link href="f_style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="main">
        <div class="header">
            <div class="header_resize">
                <div class="logo">
                    <marquee><h1><a href="index.html"><span>Jan Dhan</span></a>
                        <small>Online Banking Services</small></h1></marquee>
                </div>
                <div class="menu_nav">
                    <!-- Navigation -->

                    <ul>
                        <li ><a href="u_index.jsp">Home</a></li>
                        <li><a href="AccountSummary.jsp">My Accounts</a></li>
                        <li class="active"><a href="AccountStatement.jsp">Account Statement</a></li>
                        <li><a href="f_NetBankingLogin.jsp">Funds Transfer</a></li>
                        <li><a href="ChangeUserPassword.jsp">Change Password</a></li>
                        <li><a href="Login.jsp">LogOut</a></li>
                	 </ul>
                </div>
            </div>
        </div>
        
        <div class="content">
            <div class="content_resize">

                <div class="mainbar">
                    <div class="article">
                       
                        <div class="clr"></div>
                        
                        
   
    <br/>
    <br/>
    <form method="post" action="FetchStatement.lti">
 		Start Date : <input type="date" name="startDate" />
 		End Date : <input type="date" name="endDate" />
 		<button type="submit">Fetch Statement</button>
 	</form>
 	
 	<c:forEach items = "${ transactions }" var = "t">
 		${ t.amount }
 	</c:forEach>
 	
    </div>
</body>
</html>