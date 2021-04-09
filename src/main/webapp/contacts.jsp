<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="users.Contact" %><%--
  Created by IntelliJ IDEA.
  User: koontzhome
  Date: 4/9/21
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Contacts</title>
</head>
<body>
<h1>Contacts Table</h1>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>address</th>
        <th>phone number</th>
        <th>active</th>
        <th>Created on</th>
    </tr>
        <c:forEach var="contact" items="${contacts}">
            <c:if test="${contact.isActive}">
    <tr>
        <td>${contact.id}</td>
        <td>${contact.name}</td>
        <td>${contact.email}</td>
        <td>${contact.address}</td>
        <td>${contact.phoneNumber}</td>
        <td>${contact.isActive}</td>
        <td>${contact.dateCreated}</td>
    </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
