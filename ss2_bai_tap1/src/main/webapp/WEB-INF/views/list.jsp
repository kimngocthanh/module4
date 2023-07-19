<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Phannv_Laptop
  Date: 19/7/2023
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post">
    <table>
        <c:forEach items="${spiceList}" var="c">
            <tr>
                <th>${c.name}</th>
                <th><input type="checkbox" name="checkBoxName" value="${c.name}"></th>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="thêm">
    <p>${spice}</p>
</form>
</body>
</html>
