<%--
  Created by IntelliJ IDEA.
  User: igorkolodziejczyk
  Date: 2019-07-06
  Time: 09:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Homepage</title>
</head>
<body>
<c:if test="${cookie.cookieDecision.value != true}">
    <p>Informujemy, że ta strona korzysta z plików cookies.</p>
</c:if>
<a href='<c:url value="/cookieDecision?decision=true"/>'>Akceptuje</a>
<a href='<c:url value="/cookieDecision?decision=false"/>'>Nie akceptujek</a>
</body>
</html>
