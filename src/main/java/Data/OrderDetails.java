/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Kasper Jeppesen
 */
public class OrderDetails
{
    private final int orderId;
    private String username;
    
    private int width;
    private int length;
    private int height;
    
    private int amountOfBigBricks;
    private int amountOfMediumBricks;
    private int amountOfSmallBricks;
    
    private int numberOfDorrs;
    private int numberOfWindows;
    
    private int price;

    public OrderDetails(int orderId, String username, int width, int length, int height, int amountOfBigBricks, int amountOfMediumBricks, int amountOfSmallBricks, int numberOfDorrs, int numberOfWindows, int price)
    {
        this.orderId = orderId;
        this.username = username;
        this.width = width;
        this.length = length;
        this.height = height;
        this.amountOfBigBricks = amountOfBigBricks;
        this.amountOfMediumBricks = amountOfMediumBricks;
        this.amountOfSmallBricks = amountOfSmallBricks;
        this.numberOfDorrs = numberOfDorrs;
        this.numberOfWindows = numberOfWindows;
        this.price = price;
    }
    public int getOrderId()
    {
        return orderId;
    }

    public String getUsername()
    {
        return username;
    }

    public int getWidth()
    {
        return width;
    }

    public int getLength()
    {
        return length;
    }

    public int getHeight()
    {
        return height;
    }

    public int getAmountOfBigBricks()
    {
        return amountOfBigBricks;
    }

    public int getAmountOfMediumBricks()
    {
        return amountOfMediumBricks;
    }

    public int getAmountOfSmallBricks()
    {
        return amountOfSmallBricks;
    }

    public int getNumberOfDorrs()
    {
        return numberOfDorrs;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }

    public int getPrice()
    {
        return price;
    }
    
    
}
