<%--
  Created by IntelliJ IDEA.
  User: mint
  Date: 30/07/2019
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration page</title>
</head>
<body>

<form action="register" method="post">
    Name <input name="name" type="text"/>
    <br><br>
    Email <input name="email" type="email">
    <br><br>
    Password <input name="pass" type="password"/>
    <br><br>
    Re-Password <input name="repass" type="password"/>
    <br><br>
    <button type="submit">Register</button>

</form>



</body>
</html>
