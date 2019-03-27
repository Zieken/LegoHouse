/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kasper Jeppesen
 */
public class orderDAO
{
    public static void insertOrder(String username, int width, int length, int height, int amountOfBigBricks, int amountOfMediumBricks, int amountOfSmallBricks, int numberOfDoor, int numberOfWindows)
    {
        //String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        String status = "Not send";
        
        try
        {
            DBConnector con = new DBConnector();
            Statement statement = con.getConnection().createStatement();
            String query = "insert into orders(userName, datePlaced, status) "
                         + "values ('" + username  + "', NOW(), '" + status +  "');";
            System.out.println(query);
            statement.executeUpdate(query);
            
            String query2 = "insert into orderdetails( username, width, length, height, amountOfBigBricks, amountOfMediumBricks, amountOfSmallBricks, numberOfDoor, numberOfWindows, price)"
                          + "values ('" + username + "', '" + width + "', '" + length +  "', '" + height +  "', '" + amountOfBigBricks +  "', '" + amountOfMediumBricks +  "', '" + amountOfSmallBricks + "', '" + numberOfDoor +  "', '" + numberOfWindows + "', '" + 0 + "');";
            statement.executeUpdate(query2);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<Order> getOrdersByUser(String username)
    {
        ArrayList<Order> orders = new ArrayList<>();
        
        int orderId = 0;
        String username_ = "";
        Date dateplaced = null;
        String status = "";
        
        try
        {
            DBConnector con = new DBConnector();
            Statement statement = con.getConnection().createStatement();
            String query
                    = "SELECT * "
                    + "FROM orders "
                    + "WHERE userName = '" + username + "' ORDER BY orderId DESC;";
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next()) 
            {
                orderId = rs.getInt("orderId");
                username_ = rs.getString("userName");
                dateplaced = rs.getDate("datePlaced");
                status = rs.getNString("status");
                orders.add(new Order(orderId, username, dateplaced, status));
            }
        
        }
        catch (Exception ex)
        {
            Logger.getLogger(orderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;
    }
    
    public static OrderDetails getOrderDetailsById(int id)
    {
        OrderDetails details = null;
        
        int orderId = 0;
        String username = "";
        int width = 0;
        int length = 0;
        int height = 0;
        int amountOfBigBricks = 0;
        int amountOfMediumBricks = 0;
        int amountOfSmallBricks = 0;
        int numberOfDoors = 0;
        int numberOfWindows = 0;
        int price = 0;
        
        try
        {
            DBConnector con = new DBConnector();
            Statement statement = con.getConnection().createStatement();
            String query
                    = "SELECT * "
                    + "FROM orderdetails "
                    + "WHERE orderId = '" + id + "';";
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next()) 
            {
                orderId = rs.getInt("orderId");
                username = rs.getString("username");
                width = rs.getInt("width");
                length = rs.getInt("length");
                height = rs.getInt("height");
                amountOfBigBricks = rs.getInt("amountOfBigBricks");
                amountOfMediumBricks = rs.getInt("amountOfMediumBricks");
                amountOfSmallBricks = rs.getInt("amountOfSmallBricks");
                numberOfDoors = rs.getInt("numberOfDoor");
                numberOfWindows = rs.getInt("numberOfWindows");
                price = rs.getInt("price");
                details = new OrderDetails(orderId, username, width, length, height, amountOfBigBricks, amountOfMediumBricks, amountOfSmallBricks, numberOfDoors, numberOfWindows, price);
            }
        }
        catch (Exception ex)
        {
            Logger.getLogger(orderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }
}    
