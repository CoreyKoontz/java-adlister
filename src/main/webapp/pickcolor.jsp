<%--
  Created by IntelliJ IDEA.
  User: koontzhome
  Date: 4/12/21
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pickcolor</title>
</head>
<body>
<form action="/pickcolor" method="POST">
    <label for="color">Pick a Color: </label>
    <input type="text" id="color" name="color">
    <input type="submit">
</form>
</body>
</html>
