<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2016/4/26
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>louis system login</title>
</head>
<body>
<c:if test="${!empty error}">
    <font color="red"><c:out value="${error}"></c:out></font>
</c:if>
<form action="<c:url value="/loginCheck.html"/>" method="post">
    username:
    <input type="text" name="userName"><br>
    password:
    <input type="password" name="password"><br>
    <input type="submit" value="login">
    <input type="reset" value="reset">
</form>
</body>
</html>
