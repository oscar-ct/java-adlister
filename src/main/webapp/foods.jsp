<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: alejandro
  Date: 4/26/22
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    ArrayList<String> products = new ArrayList<>();
    products.add("Hotdog");
    products.add("Pizza");
    products.add("Nachos");
    products.add("Chicken Wings");
    products.add("Pancakes");
    products.add("Waffles");
    products.add("Pasta");
    products.add("Steak");
    products.add("Beef Ribs");
    products.add("Hamburger");
    request.setAttribute("y", products);
%>

<html>


<head>
    <title>Title</title>
</head>


<body>

<h2>Food List</h2>

<ol>
    <c:forEach var="i" items="${y}">
        <li>${i}</li>
    </c:forEach>

</ol>

<h2>Foods with more than 6 char</h2>
<ul>
    <c:forEach var="food" items="${y}">
        <c:if test="${food.length() > 6}">
            <li>${food}</li>
        </c:if>
    </c:forEach>
</ul>


</body>
</html>
