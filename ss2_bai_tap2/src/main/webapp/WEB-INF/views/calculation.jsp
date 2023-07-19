<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Phannv_Laptop
  Date: 19/7/2023
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="text" placeholder="Nhập số thứ nhất" name="number1">
    <input type="text" placeholder="Nhập số thứ hai" name="number2">
    <br>
    <input type="submit" value="sum" name="result">
    <input type="submit" value="sub" name="result">
    <input type="submit" value="core" name="result">
    <input type="submit" value="divv" name="result">
    <c:if test="${number2==0}">
        <p>${mess}</p>
    </c:if>
    <p>Kết quả : ${results}</p>
</form>
</body>
</html>
