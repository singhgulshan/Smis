<%-- 
    Document   : Success
    Created on : Oct 6, 2015, 9:28:23 AM
    Author     : Gulshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String studentid = (String) session.getAttribute("studentid");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        <h1 style="text-align:center">Student Successfully Enrolled.</h1>
        <h1 style="text-align:center">StudentId is <%=studentid%>. </h1>
    </body>
</html>
