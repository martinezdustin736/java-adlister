<%--
  Created by IntelliJ IDEA.
  User: dustinmartinez
  Date: 6/30/21
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--first set attribute--%>
<%--    creating variable in server--%>
<%  request.setAttribute("userRole", "admin");

    String message;

    switch (request.getAttribute("userRole").toString()){
        case "admin":
            message = "administrator";
            break;
        case "s_admin":
            message = "super admin";
            break;
        case "user_1":
            message = "active user";
            break;
        default:
            message = "unknown status";
    }

    request.setAttribute("userRoleMessage", message);

%>

<html>
<head>
    <title><%= "some title" %>
    </title>
</head>
<body>
<%--call first value of set attribute from above. outputs the value attached to the attribute (admin in this case)--%>
<h1>${userRole}</h1>

<%--param in browser will be value of name set in query string--%>
<h2>Your name is: ${param.name}</h2>

<h3>User Status: ${userRoleMessage}</h3>


</body>
</html>