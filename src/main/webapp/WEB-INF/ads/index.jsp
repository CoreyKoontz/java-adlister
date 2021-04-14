<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="All dao.Ads"/>
    </jsp:include>

</head>

<body>
<jsp:include page="../partials/navbar.jsp"/>

<div class="container">
    <h1>All dao.Ads:</h1>
    <c:forEach items="${ads}" var="ad">
        <div class="card">
            <div class="card-body">
                <h3 class="card-title">${ad.title}</h3>
                <h5 class="card-text">${ad.description}</h5>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
