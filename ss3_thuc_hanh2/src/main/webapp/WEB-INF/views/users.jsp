<%--
  Created by IntelliJ IDEA.
  User: Phannv_Laptop
  Date: 20/7/2023
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <table border="1">
        <tr>
            <th>Name:</th>
            <td>${users.name}</td>
        </tr>
        <tr>
            <th>Email:</th>
            <td>${users.email}</td>
        </tr>
        <tr>
            <th>Age:</th>
            <td>${users.age}</td>
        </tr>
    </table>
</form>
</body>
</html>
