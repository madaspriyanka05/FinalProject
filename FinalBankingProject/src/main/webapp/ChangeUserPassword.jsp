<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $("#btnSubmit").click(function() {
                var password = $("#txtPassword").val();
                var confirmPassword = $("#txtConfirmPassword").val();
                if (password != confirmPassword) {
                    alert("Passwords do not match.");
                    return false;
                }
                return true;
            });
        });
    </script>
    <title>JAN DHAN BANK</title>
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
                     <li><a href="u_index.jsp">Home</a></li>
                        <li ><a href="AccountSummary.jsp">My Accounts</a></li>
                        <li><a href="AccountStatement.jsp">Account Statement</a></li>
                        <li><a href="f_NetBankingLogin.jsp">Funds Transfer</a></li>
                       
                        <li><a href="LogOut.jsp">LogOut</a></li>
                	 </ul>
                </div>
            </div>
        </div>
        
     <div class="content">
            <div class="content_resize">

                <div class="mainbar">
                    <div class="article">
                        
                        <div class="clr"></div>
        
    		<div align="center">
        <table border="solid black" ;>
            <tr>
                <td>
                    Old Password:
                </td>
                <td>
                    <input type="password" id="oldtxtPassword" />
                </td>
            </tr>
            <tr>
                <td>
                    New Password:
                </td>
                <td>
                    <input type="password" id="txtPassword" />
                </td>
            </tr>
            <tr>
                <td>
                    Confirm New Password:
                </td>
                <td>
                    <input type="password" id="txtConfirmPassword" />
                </td>
            </tr>
            <tr>
                <td>
                </td>
                <td>
                    <input type="button" id="btnSubmit" value="Submit" />
                </td>
            </tr>
        </table>
    </div>
</body>