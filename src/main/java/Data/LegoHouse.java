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
public class LegoHouse
{
    private int amountOfBigBricks;
    private int amountOfMediumBricks;
    private int amountOfSmallBricks;
    
    private int amountOfDoors;
    private int amountOfWindows;
    
    public LegoHouse(int amountOfBigBricks, int amountOfMediumBricks, int amountOfSmallBricks, int amountOfDoors, int amountOfWindows)
    {
        this.amountOfBigBricks = amountOfBigBricks;
        this.amountOfMediumBricks = amountOfMediumBricks;
        this.amountOfSmallBricks = amountOfSmallBricks;
        this.amountOfDoors = amountOfDoors;
        this.amountOfWindows = amountOfWindows;
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
    public int getAmountOfDoors()
    {
        return amountOfDoors;
    }
    public int getAmountOfWindows()
    {
        return amountOfWindows;
    }
}
