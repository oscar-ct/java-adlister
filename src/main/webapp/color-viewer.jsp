<%--
  Created by IntelliJ IDEA.
  User: alejandro
  Date: 4/27/22
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Color</title>

    <style>
        body {
            <%--background-color: ${color};--%>
            background-color: ${param.color};
        }

    </style>
</head>
<body>

<h1> ${param.color} </h1>



</body>
</html>
