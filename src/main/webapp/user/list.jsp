<%--
  Created by IntelliJ IDEA.
  User: chuon
  Date: 5/28/2022
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${listUser}" var="user">
    <h1>${user.role},${user.email},${user.userName},${user.password},${user.status},${user.displayName}</h1>
</c:forEach>
</body>
</html>
