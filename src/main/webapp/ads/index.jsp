<%--
  Created by IntelliJ IDEA.
  User: dustinmartinez
  Date: 7/7/21
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads Index</title>
</head>
<body>
<h1>Here are your Ads </h1>

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <p>Price: $ ${ad.description}</p>
    </div>
</c:forEach>


</body>
</html>
