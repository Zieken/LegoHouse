/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.orderDAO;

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
}
