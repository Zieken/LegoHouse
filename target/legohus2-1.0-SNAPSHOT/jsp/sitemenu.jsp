<%-- 
    Document   : sitemenu
    Created on : 20-03-2019, 14:58:41
    Author     : Kasper Jeppesen
--%>

<%@page import="Data.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% User user = (User) session.getAttribute("user");%>

<% if(user != null) { %>
<a href="/legohus2/index.jsp">Front page</a>
<a href="/legohus2/increaseBalance.jsp">Insert money</a>
<a href="/legohus2/makeOrder.jsp">Make a order</a>
<a href="/legohus2/myOrders.jsp">Show my orders</a>
<p>Your balance is: <%= user.getBalance()%></p>

<% } else { %>
<a href="/legohus2/register.jsp"> Register </a>
<a href="/legohus2/login.jsp"> Log in </a>
<% } %>

