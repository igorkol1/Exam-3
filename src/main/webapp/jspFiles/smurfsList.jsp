<%--
  Created by IntelliJ IDEA.
  User: igorkolodziejczyk
  Date: 2019-07-06
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Smurfs List</title>
</head>
<body>
<table>
    <c:forEach items="${smurfs}" var="smurf">
        <tr>
            <td>${smurf.getName()}</td>
            <td>${smurf.getAttribute()}</td>
            <td>${smurf.getDescription()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
