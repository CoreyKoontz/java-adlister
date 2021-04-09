<%--
  Created by IntelliJ IDEA.
  User: koontzhome
  Date: 4/8/21
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Log In"/>
</jsp:include>

<body>

<%@ include file="partials/navbar.jsp" %>

<form action="/login.jsp" method="POST" name="login">
    <label for="username">Username: </label>
    <input type="text" name="username" id="username">
    <br>
    <label for="password">Password: </label>
    <input type="password" name="password" id="password">
    <br>
    <input type="submit">
</form>
<%@ include file="partials/footer.jsp" %>
<%@ include file="partials/scriptlinks.jsp" %>
<%@ include file="partials/jsScript.jsp" %>
</body>

</html>

<%!
    String username;
    String password;
%>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {

        username = request.getParameter("username");
        password = request.getParameter("password");

        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>
