<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Phannv_Laptop
  Date: 20/7/2023
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="" method="post" modelAttribute="mail">
    Languages
    <form:select path="languages" items="${languages}"/>
    <br>
    Page Size
    <form:select path="pageSize" items="${pageSize}"/>
    <br>
    Spams filter
    <form:checkbox path="spamsFiller"/>
    <br>
    Signature
    <form:input path="signature"/>
    <form:button>update</form:button>
</form:form>
</body>
</html>
