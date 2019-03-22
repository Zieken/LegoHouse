/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.LegoHouse;

/**
 *
 * @author Kasper Jeppesen
 */
public class LegoHouseMaterials
{
    LegoHouse house;
    
    public void legoHouseMaterials(int amountOfBigBricks, int amountOfMediumBricks, int amountOfSmallBricks, int amountOfDoors, int amountOfWindows)
    {
        house = new LegoHouse(amountOfBigBricks, amountOfMediumBricks, amountOfSmallBricks, amountOfDoors, amountOfWindows);
    }
    public int amountOfBigBricks()
    {
        int bigBricks = house.getAmountOfBigBricks();
        return bigBricks;
    }
    public int amountOfMediumBricks()
    {
        int mediumBricks = house.getAmountOfMediumBricks();
        return mediumBricks;
    }
    public int amountOfSmallBricks()
    {
        int smallBricks = house.getAmountOfSmallBricks();
        return smallBricks;
    }
    public int amountOfdoors()
    {
        int door = house.getAmountOfDoors();
        return door;
    }
    public int amountOfWindows()
    {
        int windows = house.getAmountOfWindows();
        return windows;
    }
   
    
        
    
}
