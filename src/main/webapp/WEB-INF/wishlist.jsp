<%--
  Created by IntelliJ IDEA.
  User: alejandro
  Date: 5/2/22
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Wishlist</title>
</head>
<body>

<h1>Wishlist</h1>

<c:forEach var="ad" items="${sessionScope['wishlist']}">
    <h3>${ad.title}</h3>
    <p>${ad.description}</p>
</c:forEach>

<form method="POST" action="/wishlist">
    <input type="hidden" name="clear">
    <button>Clear Wishlist</button>
</form>


</body>
</html>
