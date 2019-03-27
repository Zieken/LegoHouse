/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Order;
import Data.OrderDetails;
import Data.orderDAO;
import java.util.ArrayList;

/**
 *
 * @author Kasper Jeppesen
 */
public class orderController
{
    public static void insertOrder(String username, int width, int length, int height, int amountOfBigBricks, int amountOfMediumBricks, int amountOfSmallBricks, int numberOfDoor, int numberOfWindows)
    {
        orderDAO.insertOrder(username, width, length, height, amountOfBigBricks, amountOfMediumBricks, amountOfSmallBricks, numberOfDoor, numberOfWindows);
    }
    public static ArrayList<Order> getOrderByUser(String username)
    {
        ArrayList<Order> order = orderDAO.getOrdersByUser(username);
        return order;
    }
    public static OrderDetails getOrderDetailsById(int id)
    {
        OrderDetails details = orderDAO.getOrderDetailsById(id);
        return details;
    }
}
