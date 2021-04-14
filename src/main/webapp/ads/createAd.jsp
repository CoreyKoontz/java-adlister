<%--
  Created by IntelliJ IDEA.
  User: koontzhome
  Date: 4/13/21
  Time: 12:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<div class="container">
    <h1>Create an Ad!</h1>
    <form action="/ads/create" method="POST">
        <div class="form-group">
            <label for="title">Name of ad </label>
            <input id="title" name="title" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="description">Description </label>
            <input id="description" name="description" class="form-control" type="text">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Post models.Ad">
    </form>
</div>

</body>
</html>
