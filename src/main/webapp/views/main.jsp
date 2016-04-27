<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>登录成功</h2><br>
${user.userName}
<h3>username:<c:out value="${user.userName}"/>  </h3>
</body>
</html>
