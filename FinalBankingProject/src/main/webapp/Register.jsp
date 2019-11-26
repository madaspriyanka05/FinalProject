<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="Register.css">
    <link href="f_style.css" rel="stylesheet" type="text/css" />
    <title>Registration Form</title>
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
                        <h1 class="reg" style="color:blue;">REGISTRATION PAGE</h1>
                        
                        <form action="Register.lti" method="POST">
                        <table align="center" cellpadding="10">
                            <tr>
                                <td>
                                    <b>Enter FirstName:</b>
                                    <td><input type="text" placeholder="FirstName" name="firstname" size="20" required><br></td>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <b>Enter MiddleName:</b>
                                    <td><input type="text" placeholder="MiddleName" name="middlename" size="20"><br></td>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <b>Enter LastName:</b>
                                    <td><input type="text" placeholder="LastName" name="lastname" size="20" required><br></td>
                                </td>
                            </tr>

                            <td>
                                <b>Date-Of-Birth :</b>
                                <td><input type="date" name="dateofbirth" size="20" required><br></td>
                            </td>
                            </tr>

                            <tr>
                                <td>
                                    <b>Gender:</b>
                                    <td><input type="radio" name="gender" value="Male" size="20">Male
                                        <input type="radio" name="gender" value="Female" size="20">Female<br></td>
                            </tr>

                            <tr>
                                <td>
                                    <b>Address:</b>
                                    <td> <textarea rows="5" cols="30" name="address" size="20" placeholder="Enter your Address here">
                             </textarea>

                                    </td>
                            </tr>

                            <tr>
                                <td>
                                    State :
                                    <td><select>
                                    <option value="Maharashtra"  name="state">Maharashtra</option>
                                    <option value="Delhi" name="state" >Delhi</option>
                                    <option value="Andhra Pradesh"  name="state">Andhra Pradesh</option>
                                    <option value="Assam" name="state">Assam</option>
                                    <option value="Goa" name="state">Goa</option>
                                </select></td><br></td>

                            </tr>

                            <tr>
                                <td>
                                    ZipCode:
                                    <td><input type="number" placeholder="Enter Pincode" name="zipcode" size="20" required><br></td>
                                </td>
                            </tr>


                            <tr>
                                <td>FathersName:
                                    <td> <input type="text" placeholder="Enter FatherName" name="fathername" size="20" required></td><br>
                                </td>
                            </tr>


                            <tr>
                                <td>OccupationType:
                                    <td> <input type="text" placeholder="Enter OccupationType" name="occType" size="20" required></td><br>
                                </td>
                            </tr>

                            <tr>
                                <td>Income:
                                    <td> <input type="number" placeholder="Enter Income" name="income" size="20" required></td><br>
                                </td>
                            </tr>

                            <tr>
                                <td>AdharCard Number:
                                    <td><input type="text" placeholder="Enter AdharCard Number" name="aadhar" size="20" required></td><br>
                                </td>
                            </tr>

                            <tr>
                                <td>Email Id:
                                    <td> <input type="email" placeholder="Enter EmailId" name="emailId" size="20" required></td><br>
                                </td>
                            </tr>
                            </tr>

                            <td>Password:
                                <td><input type="password" id="txtPassword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" name="password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" placeholder="********"
                                        autofocus required></td><br>
                            </td>
                            </tr>
                            </tr>

                            <tr>
                                <td>Mobile Number:
                                    <td><input type="number" placeholder="Enter MobileNumber" name="mobileNo" size="20" required></td><br>
                                </td>
                            </tr>
							<tr><td>&nbsp;</td></tr>
                            <tr>
                                <td align="center"><button class="button">Submit</button>
                                <td align="center"><button class="button" type="reset" style="float:left" value="Reset">Reset</button></td>

                            </tr>
                        </table>
						</form>
                    </div>
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