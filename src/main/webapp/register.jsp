<%-- 
    Document   : Register
    Created on : 20-03-2019, 08:05:03
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
        <h1>Register!</h1>
        <form action="FrontController" method="get">
            <input type="text" name="username" placeholder="username"> <br>
            <input type="text" name="password" placeholder="password"> <br>
            <input type="submit" value="sign up">
            <input type="hidden" name="command" value="register"> 
        </form>
    </body>
</html>
