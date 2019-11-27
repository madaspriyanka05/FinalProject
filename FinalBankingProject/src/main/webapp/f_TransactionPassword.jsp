<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Jan Dhan Banking Services</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link href="f_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1><a href="index.html"><span>Jan Dhan</span></a> 
        	<small>Simple banking services</small></h1>
      </div>
      <div class="menu_nav">
        <ul>
         	<li ><a href="AccountSummary.jsp">My Accounts</a></li>
          	<li class="active"><a href="PaymentMode.html">Payments/Transfers</a></li>
        	<li><a href="Login.jsp">Logout from Jan Dhan</a></li>
        </ul>
      </div>
    </div>
  </div>

  <div class="content">
    <div class="content_resize"> 
      <div class="mainbar">
        <div class="article">
            <br>
            <form action="f_TransactionPassword.lti" method="POST">
                <table id="funds">
                        <tr>
                            <th><h2>Finishing Your Transaction...</h2></th>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td><h3>ENTER YOUR TRANSACTION PASSWORD:<h3></h3></td>
                            <td><input type="password" placeholder="********" name="transcationPassword"></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <th colspan="2"><input type="submit" value="SUBMIT"></th>
                        </tr>
                        <tr><td></td></tr><tr><td></td></tr>
                </table>
            </form>
        </div> 
        <div class="article">
                  </div>
        
            <div class="article">
                <div class="clr"></div>
                <br><br><br>
                <img src="images/img2.jpg" width="30" height="20" alt="" class="fl" />
                <p>
                    The Payments and Transfers tab enables you to make online Transactions using funds in your Accounts.
                    You can transfer funds to any Accounts.
                </p>
            </div>
      </div>
      
      <div class="sidebar">
          <div class="gadget">
            <h2><span>Quick Links</span></h2>
            <div class="clr"></div>
            <ul class="sb_menu">
                <li class="quick-link"><a href="AccountSummary.jsp ">Account Summary</a></li>
            	<li class="quick-link"><a href="AccountStatement.jsp ">Account Statement</a></li>
            	<li class="quick-link"><a href="f_paymentMode.jsp">Fund Transfer</a></li>
              	<li class="quick-link"><a href="f_NetBankingLogin.jsp">Logout</a></li>
            </ul>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>

  <div class="footer">
      <div class="footer_resize">
        <p class="lf">Net Banking.</p>
        <p class="rf">Design by Priyanka, Jyoti, Pooja and Divyanshu</p>
        <div class="clr"></div>
      </div>
  </div>
</div>
</body>
</html>