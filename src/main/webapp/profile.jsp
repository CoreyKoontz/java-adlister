<%--
  Created by IntelliJ IDEA.
  User: koontzhome
  Date: 4/8/21
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<%------------------------------------- Head includedfrom head.jsp --%>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Profile"/>
</jsp:include>

<body>

<%------------------------------------- Navbar from pizza project included by navbar.jsp --%>

<%@ include file="partials/navbar.jsp" %>

<h1>This is your profile page!</h1>

<%------------------------------------- Footer with jquery included from footer.jsp --%>
<%@ include file="partials/footer.jsp" %>

<%------------------------------------- Bootstrap and jquery scripts included from scriptlinks.jsp --%>
<%@ include file="partials/scriptlinks.jsp" %>

<%------------------------------------- jquery function included from jsScript.jsp --%>
<%@ include file="partials/jsScript.jsp" %>

</body>
</html>
