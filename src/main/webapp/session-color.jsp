<%--
  Created by IntelliJ IDEA.
  User: alejandro
  Date: 5/2/22
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Session Color</title>
</head>
<body>

<form action="/session-color" method="POST">
    <input name="font-color" type="color" id="font-color">
    <label for="font-color">Font Color</label>
    <input name="bg-color" type="color" id="bg-color">
    <label for="bg-color">Background Color</label>
    <button>Submit Colors</button>
</form>

<form action="/session-color" method="POST">
    <input type="hidden" name="forget">
    <button>Forget</button>
</form>

</body>
</html>
