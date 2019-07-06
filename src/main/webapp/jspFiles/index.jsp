<%--
  Created by IntelliJ IDEA.
  User: igorkolodziejczyk
  Date: 2019-07-06
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index JSP</title>
</head>
<body>
<a href='<c:url value="/receiver?name=coder&mail=coder@somemain.com&id=34"/>'>Zadanie 1 (Uzupełnione dane)</a><br>
<a href='<c:url value="/receiver"/>'>Zadanie 1 (Formularz)</a><br>
<a href='<c:url value="/smurfs"/>'>Zadanie 2</a><br>
<a href='<c:url value="/regex"/>'>Zadanie 3</a><br>
<a href='<c:url value="/addquote"/>'>Zadanie 4</a><br>
<a href='<c:url value="/homepage"/>'>Zadanie 5</a><br>
</body>
</html>
