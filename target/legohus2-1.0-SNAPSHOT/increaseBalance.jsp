<%-- 
    Document   : increaseBalance
    Created on : 20-03-2019, 16:34:39
    Author     : Kasper Jeppesen
--%>

<%@page import="Data.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page='/jsp/sitemenu.jsp'></jsp:include>
<!DOCTYPE html>
<% User user = (User) request.getSession().getAttribute("user"); %>

<h1>Insert money</h1>
<form action="FrontController" method="get">
    <input type="text" name="newBalance" placeholder="Insert money"> 
    <input type="submit" name="add" value="add money">
    <input type="hidden" name="command" value="increaseTheBalance">
</form>
      
