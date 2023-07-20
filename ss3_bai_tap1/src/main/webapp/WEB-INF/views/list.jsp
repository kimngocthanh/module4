<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Phannv_Laptop
  Date: 20/7/2023
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Language</th>
        <th>Page Size</th>
        <th>Spam Filter</th>
        <th>Signature</th>
        <th>Edit</th>
    </tr>
    <c:forEach items="${mail}" var="c">
        <tr>
            <td>${c.languages}</td>
            <td>${c.pageSize}</td>
            <td>${c.spamsFiller}</td>
            <td>${c.signature}</td>
            <td><a href="/mail/edit?id=${c.id}">edit</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
