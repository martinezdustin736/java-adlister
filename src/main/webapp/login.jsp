<%--
  Created by IntelliJ IDEA.
  User: dustinmartinez
  Date: 6/30/21
  Time: 12:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>
<html>
<head>
    <%@ include file="partials/head.jsp"%>
    <title>Title</title>
</head>
<body>
<div class="card-body">
    <h3 class="card-title">Please Log In</h3>
    <form method="POST" action="login.jsp">
        <label for="username">Username</label>
        <input id="username" name="username" type="text" class="form-control" autocomplete="false">
        <br>
        <label for="password">Password</label>
        <input id="password" name="password" type="password" class="form-control" autocomplete="false">
        <br>
        <input type="submit" class="btn-secondary">
    </form>
</div>

<%@ include file="partials/scripts.jsp"%>

</body>
</html>
