/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.User;
import Logic.LegoBricksCalculator;
import Logic.orderController;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kasper Jeppesen
 */
public class makeOrderCommand extends Command
{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        User user = (User) request.getSession().getAttribute("user");
        LegoBricksCalculator calculator = new LegoBricksCalculator();
        
        int width = Integer.parseInt(request.getParameter("width"));
        int length = Integer.parseInt(request.getParameter("length"));
        int height = Integer.parseInt(request.getParameter("height"));
        
        //String contains "on" if checked, otherwise null
        String doorPicked = request.getParameter("door");
        String windowPicked = request.getParameter("window");
        
        calculator.numberOfLegoBricks(width, length, height, doorPicked, windowPicked);
        
        int amountOfBigBrick = calculator.getNumberOfBigBrick();
        int amountOfMediumBrick = calculator.getNumberOfMediumBrick();
        int amountOfSmallBrick = calculator.getNumberOfSmallBrick();
        
        int amountOfDoor = calculator.getNumberOfDoor();
        int amountOfWindow = calculator.getNumberOfWindow();
        
        orderController.insertOrder(user.getUsername(), width, length, height, amountOfBigBrick, amountOfMediumBrick, amountOfSmallBrick, amountOfDoor, amountOfWindow);
        response.sendRedirect("orderConfirmation.jsp");
        
        
        
//        System.out.println(amountOfBigBrick);
//        System.out.println(amountOfMediumBrick);
//        System.out.println(amountOfSmallBrick);
//        
//        System.out.println(doorPicked);
//        System.out.println(windowPicked);
//        
//        System.out.println(amountOfDoor);
//        System.out.println(amountOfWindow);
    }
    
}
