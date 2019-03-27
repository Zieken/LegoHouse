<%-- 
    Document   : login
    Created on : 20-03-2019, 11:04:09
    Author     : Kasper Jeppesen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Log in!</h1>
        <form action="FrontController" method="get">
            <input type="text" name="username" placeholder="username"> <br>
            <input type="text" name="password" placeholder="password"> <br>
            <input type="submit" value="log in">
            <input type="hidden" name="command" value="login">
        </form>
    </body>
</html>

<% 
    if(request.getSession().getAttribute("LoginResult") != null && request.getSession().getAttribute("LoginResult") == "LoginFailed")
    {
%>
<p style="color: red">Login failed, please try again!</p>
<%
    }
    request.getSession().invalidate();
%>    
