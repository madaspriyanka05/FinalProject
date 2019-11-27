<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
    <title>JAN DHAN BANK</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link href="index.css" rel="stylesheet" type="text/css" />
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
                        <li class="active"><a href="u_index.jsp">Home</a></li>
                        <li ><a href="AccountSummary.jsp">My Accounts</a></li>
                        <li><a href="AccountStatement.jsp">Account Statement</a></li>
                        <li><a href="f_paymentMode.jsp">Funds Transfer</a></li>
                        <li><a href="ChangeUserPassword.jsp">Change Password</a></li>
                        <li><a href="Login.jsp">LogOut</a></li>
                       
                	 </ul>
                </div>
            </div>
        </div>


		<div class="content">
            <div class="content_resize">

                <div class="mainbar">
                    
           

        <div class="content">
            <div class="content_resize">
            <center>
					<h1 style="color:blue;">JAN DHAN BANK</h1>
					<h1 style="color:green;">WELCOMES YOU !!!</h1>
					<H2> ${ sessionScope.user.firstname } ${ sessionScope.user.lastname }</H2>
					<h2>WE ARE ALWAYS HERE TO HELP YOU</h2>
					</center>
                	

                <div class="clr"></div>
            </div>
        </div>

      </div>
    </div>
</body>

</html>