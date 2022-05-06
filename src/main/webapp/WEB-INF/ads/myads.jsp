<%--
  Created by IntelliJ IDEA.
  User: alejandro
  Date: 5/5/22
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>My Ads</h1>

    <c:forEach var="ad" items="${myads}">
        <div class="col-md-6">
            <h2>
                <c:out value="${ad.title}" />
            </h2>
            <p>
                <c:out value=" ${ad.description}" />
            </p>
        </div>
    </c:forEach>


</div>

</body>
</html>
