<%--
  Created by IntelliJ IDEA.
  User: igorkolodziejczyk
  Date: 2019-07-06
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Quote</title>
</head>
<body>

<form method="POST">
    <label>
        Autor:
        <input type="text" name="author">
    </label>
    <label>
        Content:
        <input type="text" name="quote">
    </label>
    <input type="submit">
</form>

</body>
</html>
