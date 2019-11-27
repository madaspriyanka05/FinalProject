<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link href="f_style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<!-- script for login validation after 3 attempts -->
  <script type="text/javascript" >
    var login_attempts=3;
    function check_form()
    {
     var name=document.getElementById("uname").value;
     var pass=document.getElementById("pass").value;
     if(name=="abc" && pass=="123")
     {
      alert("SuccessFully Logged In");
      document.getElementById("uname").value="";
      document.getElementById("pass").value="";
     }
     else
     {
      if(login_attempts==0)
      {
       alert("No Login Attempts Available");
      }
      else
      {
       login_attempts=login_attempts-1;
       alert("Login Failed Now Only "+login_attempts+" Login Attempts Available");
       if(login_attempts==0)
       {
        document.getElementById("uname").disabled=true;
        document.getElementById("pass").disabled=true;
        document.getElementById("form1").disabled=true;
       }
      }
     }
     
     return false;
    }	
    </script>

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
                        <li><a href="Register.jsp">REGISTER</a></li>
                        <li><a href="index.jsp">GO BACK</a></li>
                	 </ul>
                </div>
            </div>
        </div>
        
        <div class="content">
            <div class="content_resize">

                <div class="mainbar">
                    <div class="article">
                        <div class="clr"></div>

<div class="login" align="center">
<br><br><br>
	
	<b>${ message }</b>

    <form method="post" action="Login.lti" onsubmit="return check_form();" id="form1">
        <p><input type="text" name="emailId" value="" placeholder="Username or Email" id="uname"></p>
        <p><input type="password" name="password" value="" placeholder="Password" id="psw"></p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>
    </form>
</div>

<div class="login-help">
    <p>Forgot your password? <a href="changePassword.jsp">Click here to reset it</a>.</p>
</div>
</body>
</html>