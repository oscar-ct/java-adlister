<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <form method="POST" action="/wishlist">
                <input type="hidden" name="ad-title" id="ad-title" value="${ad.title}">
                <input type="hidden" name="ad-desc" id="ad-desc" value="${ad.description}">
                <button>Add to wishlist</button>
            </form>
        </div>
    </c:forEach>
</div>

</body>
</html>
