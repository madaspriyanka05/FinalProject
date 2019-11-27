<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
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
            </div>
        </div>

        <div class="content">
            <div class="content_resize">
            <br><br> 
				<h1 style="color:blue;">Thank You ${ sessionScope.user.firstname } ${ sessionScope.user.lastname } 
						<br>Your transaction is successful !!</h1>
                <div class="clr"></div>
                <br><br>
                <center>
                <h2><a href="u_index.jsp">Please click here to move to Dashboard</a></h2>
                </center>
            </div>
        </div>

</body>

</html>