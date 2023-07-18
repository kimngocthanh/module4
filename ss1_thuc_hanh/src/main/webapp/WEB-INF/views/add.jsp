<%--
  Created by IntelliJ IDEA.
  User: Phannv_Laptop
  Date: 18/7/2023
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customer/add" method="post">
    <input type="text" name="id" placeholder="Nhập id">
    <input type="text" name="name" placeholder="Nhập tên">
    <input type="text" name="email" placeholder="Nhập email">
    <input type="text" name="address" placeholder="Nhập địa chỉ">
    <input type="submit" value="Thêm">
</form>
</body>
</html>
