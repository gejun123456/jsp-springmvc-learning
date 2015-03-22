<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/18/2015
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>login</title>
</head>
<body>
  <form action="/login" method="GET">
    First Name: <input type="text" name="name">
    <br />
    Last Name: <input type="text" name="password" />
    <input type="submit" value="Submit" />
</form>
</body>
</html>
