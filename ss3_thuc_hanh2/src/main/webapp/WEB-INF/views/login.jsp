<%--
  Created by IntelliJ IDEA.
  User: Phannv_Laptop
  Date: 20/7/2023
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/login" >
    <label for="account">Account: </label>
    <input type="text" placeholder="enter account" name="account" id="account">
    <br>
    <label for="password">Password: </label>
    <input type="password" placeholder="enter password" name="password" id="password">
    <input type="submit" value="login">
</form>
</body>
</html>
