<%--
  Created by IntelliJ IDEA.
  User: igorkolodziejczyk
  Date: 2019-07-06
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Form jsp</title>
</head>
<body>
<form method="GET">
    <label>
        Email:
        <input type="text" name="mail">
    </label>
    <label>
        Name:
        <input type="text" name="name">
    </label>
    <label>
        Id:
        <input type="number" name="id">
    </label>
    <input type="submit">
</form>
</body>
</html>
