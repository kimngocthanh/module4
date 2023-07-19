<%--
  Created by IntelliJ IDEA.
  User: Phannv_Laptop
  Date: 18/7/2023
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customer/edit?id=${id}" method="post">
    <table>
        <tr>
            <th>Tên</th>
            <th><input type="text" value="${customer.name}" name="name"></th>
        </tr>
        <tr>
            <th>email</th>
            <th><input type="text" value="${customer.email}" name="email"></th>
        </tr>
        <tr>
            <th>address</th>
            <th><input type="text" value="${customer.address}" name="address"></th>
        </tr>
        <tr>
            <th>Sửa</th>
            <td><input type="submit" value="sửa"></td>
        </tr>
    </table>
</form>
</body>
</html>
