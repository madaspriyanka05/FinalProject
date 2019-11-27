<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    
    <title>JAN DHAN BANK</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
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
                        <li class="active"><a href="AccountSummary.jsp">My Accounts</a></li>
                        <li><a href="AccountStatement.jsp">Account Statement</a></li>
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
		 <center>
		 
    <br/>
    <br/>
    <table border="5" align="center">
        <tr>
            <th> Account Number </th>
            <th> Holder Name </th>
            <th> Opening Date </th>
            <th> Account Balance </th>
        </tr>
        <tr>
            <td> ${ sessionScope.user.customeraccount.accountId }  </td>
            <td> ${ sessionScope.user.firstname } ${ sessionScope.user.lastname } </td>
            <td> ${ sessionScope.user.customeraccount.openDate } </td>
            <td> ${ sessionScope.user.customeraccount.balance } </td>
        </tr>
    </table>
      </div>

                <div class="clr"></div>
            </div>
        </div>

        <div class="footer">
            <div class="footer_resize">
                <p class="lf">Copyright &copy; <a href="#">Net Banking</a>. All Rights Reserved</p>
                <p class="rf">Design by <a target="_blank" href="http://www.freewebsitetemplatez.com/">FreeWebsiteTemplatez</a></p>
                <div class="clr"></div>
            </div>
        </div>
    </div>

</body>
</html>