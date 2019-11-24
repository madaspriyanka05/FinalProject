<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>JAN DHAN Banking Services</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <h1 align="center">Account Statement</h1>
    <p align="right">
        <a href="">Click here to go back</a>
    </p>
    <link rel="stylesheet" href="AccountStatement.css">
 <script>
        $(document).ready(function() {
            $("table").hide();

            $("button").click(function() {
                var empt = document.forms["form1"]["fromdate"].value;
                var empt1 = document.forms["form1"]["todate"].value;
                if (empt == "" && empt1 == "") {

                    alert("Please input a Value");
                    return false;
                } else {
                    $("table").show();

                }
            });

        });
    </script>
</head>

<body>
  <div class="foll">
        <h2> <span>Quick Links</span>
        </h2>
        <ul class="sb_menu ">
            <li><a href="# ">Account Details</a></li>
            <li><a href="# ">Account Summary</a></li>
            <li><a href="# ">Fund Transfer</a></li>
            <li><a href="# ">Account Statement</a></li>
        </ul>

    </div>
    <div>
        <form name=form1>
            <div class="wrapper">
                <label>From</label>
                <input type="date" name="fromdate">
                <label>To</label>
                <input type="date" name="todate"><br/>
            </div>
            <div class="wrapper">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>
    <br/>
    <br/>
    <table border="5" align="center">
        <tr>
            <th> Account Number </th>
            <th> Holder Name </th>
            <th> Account Type </th>
            <th> Account Balance </th>
        </tr>
        <tr>
            <td> 1234 </td>
            <td> pooja </td>
            <td> saving </td>
            <td> 15000 </td>
        </tr>
    </table>

    </div>
</body>
</html>