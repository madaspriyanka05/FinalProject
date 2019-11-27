<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="changePass.css" rel="stylesheet">
    <link href="f_style.css" rel="stylesheet" type="text/css" />
    <!------ Include the above in your HEAD tag ---------->
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
                        <li><a href="Login.jsp">LOGIN</a></li>
                        <li><a href="index.jsp">GO BACK</a></li>
                        <li class="active"><a href="ChangeUserPassword.jsp">Change Password</a></li>
                        
                	 </ul>
                </div>
            </div>
        </div>
	
	
	
<div class="container">
    <div class="row">
        <div class="col-sm-4 text-center centered">

            <h2 style="text-align:center">Set new Password</h2>
            <br/>
            <br/>

            <label>Login Password</label>
            <div class="form-group pass_show">
                <input type="password" value="faisalkhan@123" class="form-control" placeholder="Current Password" required>
            </div>
            <label>Confirm Login Password</label>
            <div class="form-group pass_show">
                <input type="password" value="faisal.khan@123" class="form-control" placeholder="New Password" required>
            </div>
            <label>Transaction Password</label>
            <div class="form-group pass_show">
                <input type="password" value="faisalkhan@123" class="form-control" placeholder="Current Password" required>
            </div>
            <label>Confirm Transaction Password</label>
            <div class="form-group pass_show">
                <input type="password" value="faisal.khan@123" class="form-control" placeholder="Confirm Password" required>
            </div>

        </div>
    </div>
    <center>
    <div class="form-actions">
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="button" class="btn">Cancel</button>
    </div>
    </center>
</div>