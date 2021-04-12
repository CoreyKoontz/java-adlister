<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>

<form action="/pizza-order" method="POST">
    <div class="form-group">
        <h2>Choose your crust!</h2>
        <label for="crust-selection">Crust Type</label>
        <select name="crust-selection" id="crust-selection">
            <option value="original">Original</option>
            <option value="thin-crispy">Thin & Crispy</option>
            <option value="deep">Deep Dish</option>
        </select>
    </div>
    <div class="form-group">
        <h2>Choose your sauce!</h2>
        <label for="sauce-selection">Crust Type</label>
        <select name="sauce-selection" id="sauce-selection">
            <option value="regular">Regular</option>
            <option value="extra">Extra Sauce</option>
            <option value="light">Light Sauce</option>
        </select>
    </div>
    <div class="form-group">
        <h2>Choose your size!</h2>
        <label for="size-selection">Crust Type</label>
        <select name="size-selection" id="size-selection">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
    </div>
    <input type="submit">
</form>
</body>
</html>