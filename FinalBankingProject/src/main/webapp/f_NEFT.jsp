<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Jan Dhan Banking Services</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link href="f_style.css" rel="stylesheet" type="text/css" />
<style>
    select {
        width: 278px;
        margin: 10px;
    }   
</style>
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
        		<li><a href="u_index.jsp">Home</a></li>
                <li ><a href="AccountSummary.jsp">My Accounts</a></li>
                <li><a href="AccountStatement.jsp">Account Statement</a></li>
                <li class="active"><a href="f_paymentMode.jsp">Funds Transfer</a></li>
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
            <br>
            <form action="f_NEFT.lti" method="POST">
                    <table id="funds">
                            <caption>INITIATE TRANSACTION</caption>
                            <tr><td>&nbsp;</td></tr>
                            <tr>
                                <td><h3>From Account Name:<h3></h3></td>
                                <td><input type="text" name="fromAccountName" size="35" id="fromAccName" value="${ sessionScope.user.firstname }" readonly></td>
                            </tr>
                            <tr>
                                <td><h3>From Account Number:<h3></h3></td>
                                <td><input type="text" name="fromAccountId" size="35" id="fromAccNumber" value="${ sessionScope.user.customeraccount.accountId }" readonly ></td>
                            </tr> 
                            <tr>
                                <td><h3>To Account Name:<h3></h3></td>
                                <td>
                            <select name="toAccountName">
                              <option value="priyanka" size="35">priyanka</option>
                              <option value="Jyoti">Jyoti</option>
                              <option value="seema">seema</option>
                            </select>
                          </td>
                            </tr>
                            <tr>
                                    <td><h3>To Account Number:<h3></h3></td>
                                    <td>
                                    <select name="toAccountId">
                              <option value="1234" size="35">1234</option>
                              <option value="7707">7707</option>
                              <option value="5678">5678</option>
                            </select></td>
                                </tr>
                             <tr>
                                <td><h3>Type of Payment:<h3></h3></td>
                                <td>
                                	<select name="tType">
                              			<option value="IMPS">Immediate Payment Service (IMPS)</option>
                              			<option value="NEFT">National Electronic Funds Transfer (NEFT)</option>
                              			<option value="RTGS">Real Time Gross Settlement (RTGS)</option>
                              		</select>
                            	</td>
                            </tr>
                            <tr>
                                <td><h3>Amount:<h3></h3></td>
                                <td><input type="text" name="amount" placeholder="100" size="35" id="RTGSamount"></td>
                            </tr>
                             <tr>
                                <td>                            </tr>
                            <tr><td>&nbsp;</td></tr>
                            <tr>
                                <th><input type="submit" value="SUBMIT"></th>
                                <th><input type="reset" value="RESET"></th>
                            </tr>
                        </table>
                </form>
                <br>
              </div>
            <div class="article">
                <div class="clr"></div>
                <br><br><br>
                <img src="f_images/images.png" width="30" height="20" alt="" class="fl" />
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
<script>
document.getElementById('dt').value = new Date().toDateInputValue();
</script>
</body>
</html>