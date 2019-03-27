<%-- 
    Document   : showOrderDetails
    Created on : 23-03-2019, 15:09:25
    Author     : Kasper Jeppesen
--%>

<%@page import="Logic.orderController"%>
<%@page import="Data.OrderDetails"%>
<%@page import="Data.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    User user = (User) session.getAttribute("user");
    int orderId = Integer.parseInt(request.getParameter("id"));
    OrderDetails o = orderController.getOrderDetailsById(orderId);
%>

<table style="color: black" border="1" > 
 <h1>Ordre <%= o.getOrderId()%></h1>
     <tr>
            <th>Width</th>
            <th>Length</th>
            <th>Height</th>
            <th>Big bricks</th>
            <th>Medium bricks</th>
            <th>Small bricks</th>
            <th>Door</th>
            <th>Window</th>
    </tr>
    <tr>
            <td><%= o.getWidth() %></td>
            <td><%= o.getLength() %></td>
            <td><%= o.getHeight() %></td>
            <td><%= o.getAmountOfBigBricks() %></td>
            <td><%= o.getAmountOfMediumBricks() %></td>
            <td><%= o.getAmountOfSmallBricks() %></td>
            <td><%= o.getNumberOfDorrs() %></td>
            <td><%= o.getNumberOfWindows() %></td>
    </tr>
</table>    
