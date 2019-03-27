<%-- 
    Document   : allOrders
    Created on : 22-03-2019, 15:26:52
    Author     : Kasper Jeppesen
--%>

<%@page import="Data.User"%>
<%@page import="Data.Order"%>
<%@page import="Logic.orderController"%>
<jsp:include page='/jsp/sitemenu.jsp'></jsp:include>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% User user = (User) session.getAttribute("user");%>
<!DOCTYPE html>

<%
        for(Order o : orderController.getOrderByUser(user.getUsername()))
            {
%>
<a href="/legohus2/showOrderDetails.jsp?id=<%=o.getOrderId()%>">Ordernr: <%=o.getOrderId()%> - Date: <%=o.getDatePlaced()%> - Status: <%=o.getStatus()%> </a> <br>

<% } %>

   
