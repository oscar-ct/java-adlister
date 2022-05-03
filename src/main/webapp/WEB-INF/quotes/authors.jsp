<%--
  Created by IntelliJ IDEA.
  User: alejandro
  Date: 5/3/22
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authors</title>
</head>
<body>

<h2>Add an author to the database</h2>
<form action="/authors" method="POST">
    <label for="author_name">Author Name:</label>
    <input type="text" name="author_name" id="author_name">
    <input type="submit" value="Submit">
</form>

<c:forEach var="author" items="${authors}">
    <p>${author.id}: ${author.author_name}</p>
</c:forEach>

</body>
</html>
