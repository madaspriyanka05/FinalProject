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
          <li class="active"><a href="PaymentMode.html">Payments/Transfers</a></li>
        
        </ul>
        <div class="searchform">
          <form id="formsearch" name="formsearch" method="post" action="#">
            <span>
            <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" placeholder="Search our site:" type="text" />
            </span>
            <input name="button_search" src="f_images/search_btn.gif" class="button_search" type="image" />
          </form>
        </div>
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
                            <caption>Initiate (NEFT) Transaction</caption>
                            <tr><td>&nbsp;</td></tr>
                            <!-- <tr>
                                <td><h3>From Account Name:<h3></h3></td>
                                <td><input type="text" name="" placeholder="Minions" id="RTGSfromAccName"></td>
                            </tr>-->
                            <tr>
                                <td><h3>From Account Number:<h3></h3></td>
                                <td><input type="text" name="fromAccountId" placeholder="session se" size="35" id="RTGSfromAccNumber"></td>
                            </tr> 
                            <tr>
                                <td><h3>To Account Name:<h3></h3></td>
                                <td>
                            <select name="toAccountName">
                              <option value="What is your favorite color ?" size="35">What is your favorite color ?</option>
                              <option value="What is your pet name ?">What is your pet name ?</option>
                              <option value="Which is your birthplace ?">Which is your birthplace ?</option>
                            </select>
                          </td>
                            </tr>
                            <tr>
                                    <td><h3>To Account Number:<h3></h3></td>
                                    <td><input type="text" name="toAccountId" placeholder="123456789" size="35" id="RTGStoAccNumber"></td>
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
                                <td><h3>Date:<h3></h3></td>
                                <td><input type="date" name="dateandtime" placeholder="24-11-2019" height="95px" id="RTGSamount"></td>
                            	<%-- <%= (new java.util.Date()).toLocaleString()%> --%>
                            </tr>
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
               <li><a href="AccountSummary.jsp ">Account Summary</a></li>
            <li><a href="f_Index.jsp">Fund Transfer</a></li>
            <li><a href="AccountStatement.jsp ">Account Statement</a></li>
              <li class="quick-link"><a href="LogOut.jsp">Logout</a></li>
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