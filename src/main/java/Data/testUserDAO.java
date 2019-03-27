/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.LoginController;
import Logic.orderController;
import java.util.ArrayList;

/**
 *
 * @author Kasper Jeppesen
 */
public class testUserDAO
{
    public static void main(String[] args)
    {
        //UserDAO.insertUser("Robin", "førsteTest", 0);
//        User u = UserDAO.getUser("tom");
//        System.out.println(u.getUsername());
//        System.out.println(u.getPassword());
//        System.out.println(u.getBalance());
//        System.out.println(u.getIsAdmin());
//        
//        LoginController.getUser("tom");
//        System.out.println(u.getUsername());
//        System.out.println(u.getPassword());
//        System.out.println(u.getBalance());
//        System.out.println(u.getIsAdmin());
        
        
//        ArrayList<Order> testOrder = orderDAO.getOrdersByUser("tom");
//        
//        for(int i = 0; i < testOrder.size(); ++i)
//        {
//            System.out.println(testOrder.get(i).getOrderId());
//            System.out.println(testOrder.get(i).getUsername());
//            System.out.println(testOrder.get(i).getDatePlaced());
//            System.out.println(testOrder.get(i).getStatus());
//        }
        
        OrderDetails details = orderController.getOrderDetailsById(4);
        System.out.println(details.getOrderId());
        System.out.println(details.getUsername());
        System.out.println(details.getWidth());
        System.out.println(details.getLength());
        System.out.println(details.getHeight());
        System.out.println(details.getAmountOfBigBricks());
        System.out.println(details.getAmountOfMediumBricks());
        System.out.println(details.getAmountOfSmallBricks());
        System.out.println(details.getNumberOfDorrs());
        System.out.println(details.getNumberOfWindows());
        System.out.println(details.getPrice());
        
        
    }
}
