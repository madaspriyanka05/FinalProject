<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>JAN DHAN Banking Services</title>
    <h2 align="center">SET NEW PASSWORD</h2>
    <link rel="stylesheet" href="ChangeUserPassword.css">
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
</head>

<body>
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