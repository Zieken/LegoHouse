/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.BigLegoBrick;
import Data.LegoBrick;
import Data.LegoDoor;
import Data.LegoWindow;
import Data.MediumLegoBrick;
import Data.SmallLegoBrick;

/**
 *
 * @author Kasper Jeppesen
 */
public class LegoBricksCalculator
{
    private int numberOfBigBrick = 0;
    private int numberOfMediumBrick = 0;
    private int numberOfSmallBrick = 0;
    
    private int numberOfdoor = 0;
    private int numberOfWindow = 0;
    
    //Note: No reason to use mediumBrick as part of the width, as meidumBrick has the same width as a bigBrick
    //This method calculates how many of what kind of brick that is needed for the width and adds it to the corresponding field. 
   
    public void sideWalls(int width, int length)
    {
        LegoBrick bigBrick = new BigLegoBrick();
        LegoBrick mediumBrick = new MediumLegoBrick();
        LegoBrick smallBrick = new SmallLegoBrick();
        
        //This loop is to get the numbers of bricks required for the length of the two sidewalls.
        for(int i = 0; i < width;)
        {
            //if length missing of the sidewall is bigger than 4
            if(width >= bigBrick.getLentgh())
            {
                //+ 2 because there is two sidewalls
               numberOfBigBrick = numberOfBigBrick + 2;
                width = width - bigBrick.getLentgh();
            }
            //if lenth missing of the sidewall is 3 or 2
            else if(width < bigBrick.getLentgh() && width >= mediumBrick.getLentgh())
            {
                //+ 2 because there is two sidewalls
                numberOfMediumBrick = numberOfMediumBrick + 2;
                width = width - mediumBrick.getLentgh();
            }
            //if length missing of the sidewall is 1
            else if(width < bigBrick.getLentgh() && width < mediumBrick.getLentgh() && width >= smallBrick.getWidth())
            {
                //+ 2 because there is two sidewalls
                numberOfSmallBrick = numberOfSmallBrick + 2;
                width = width - smallBrick.getWidth();
            }
        }
    }
    public void frontWall(int width, int length, int heigt, String doorPicked)
    {
        LegoBrick bigBrick = new BigLegoBrick();
        LegoBrick mediumBrick = new MediumLegoBrick();
        LegoBrick smallBrick = new SmallLegoBrick();
        
        LegoBrick LegoDoor = new LegoDoor();
        
        //Note: length -4 because the width of the two sidewalls is 4 combined, and its only the length inbetween the sidewalls that is needed
        int innerLength = length-4;
        //Check if the door fits the house. +1 and +2 to make sure there is some wall on all side of the door at the innerlength of the frontwall
        if(innerLength >= LegoDoor.getLentgh()+2 && LegoDoor.getHeight()+1 <= heigt && doorPicked.equals("on"))
        {
            innerLength = innerLength - LegoDoor.getLentgh();
            ++numberOfdoor;
        }
        
        //This loop is to get the numbers of bricks required for the frontwall
        for (int i = 0; i < innerLength;)
        {
            //if length missing of the front or back wall is bigger than 4
            if(innerLength >= bigBrick.getLentgh())
            {
               ++ numberOfBigBrick;
               innerLength = innerLength - bigBrick.getLentgh();
            }
            //if length missing of the frontwall is 3 or 2
            else if(innerLength < bigBrick.getLentgh() && innerLength >= mediumBrick.getLentgh())
            {
                ++ numberOfMediumBrick;
                innerLength= innerLength - mediumBrick.getLentgh();
            }
            //if length missing of the frontwall is 1
            else if(innerLength < bigBrick.getLentgh() && innerLength < mediumBrick.getLentgh() && innerLength >= smallBrick.getWidth())
            {
                ++ numberOfSmallBrick;
                innerLength = innerLength - smallBrick.getWidth();
            }
        }
    }
    public void backWall(int width, int length, int height, String windowPicked)
    {
        LegoBrick bigBrick = new BigLegoBrick();
        LegoBrick mediumBrick = new MediumLegoBrick();
        LegoBrick smallBrick = new SmallLegoBrick();
        
        LegoBrick LegoWindow = new LegoWindow();
        
        //Note: length -4 because the width of the two sidewalls is 4 combined, and its only the length inbetween the sidewalls that is needed
        int innerLength = length-4;
        
        //Check if the window fits the house. +2 to make sure there is some wall on all side of the window at the innerlenght of the backwall
        if(innerLength >= LegoWindow.getLentgh()+2 && LegoWindow.getHeight()+2 <= height && windowPicked.equals("on"))
        {
            innerLength = innerLength - LegoWindow.getLentgh();
            ++numberOfWindow;
        }
        
        //This loop is to get the numbers of bricks required for the backwall
        for (int i = 0; i < innerLength;)
        {
            //if length missing of the back wall is bigger than 4
            if(innerLength >= bigBrick.getLentgh())
            {
               ++ numberOfBigBrick;
               innerLength = innerLength - bigBrick.getLentgh();
            }
            //if length missing of the back wall is 3 or 2
            else if(innerLength < bigBrick.getLentgh() && innerLength >= mediumBrick.getLentgh())
            {
                ++ numberOfMediumBrick;
                innerLength= innerLength - mediumBrick.getLentgh();
            }
            //if length missing of the back wall is 1
            else if(innerLength < bigBrick.getLentgh() && innerLength < mediumBrick.getLentgh() && innerLength >= smallBrick.getWidth())
            {
                ++ numberOfSmallBrick;
                innerLength = innerLength - smallBrick.getWidth();
            }
        }
    }
    
    public void numberOfLegoBricks(int width, int length, int height, String doorPicked, String windowPicked)
    {
        //these calculates the amount of bricks needed without the height
        sideWalls(width, length);
        frontWall(width, length, height, doorPicked);
        backWall(width, length, height, windowPicked);
        
        //here the hieght get calculated in
        numberOfBigBrick = numberOfBigBrick * height;
        numberOfMediumBrick = numberOfMediumBrick * height;
        numberOfSmallBrick = numberOfSmallBrick * height;
    }
    
    public int getNumberOfBigBrick()
    {
        return numberOfBigBrick;
    }
    public int getNumberOfMediumBrick()
    {
        return numberOfMediumBrick;
    }
    public int getNumberOfSmallBrick()
    {
        return numberOfSmallBrick;
    }
    public int getNumberOfDoor()
    {
        return numberOfdoor;
    }
    public int getNumberOfWindow()
    {
        return numberOfWindow;
    }
}
