<%--
  Created by IntelliJ IDEA.
  User: igorkolodziejczyk
  Date: 2019-07-06
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All quotes</title>
</head>
<body>
Quotes:
<table>

    <c:forEach items="${quoteList}" var="quote">
        <tr>
            <td>${quote.getAuthor()}</td>
            <td>${quote.getContent()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
