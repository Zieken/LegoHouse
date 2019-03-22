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
public class LegoWindow implements LegoBrick
{
    private final int width = 2;
    private final int length = 2;
    private final int height = 2;

    @Override
    public int getLentgh()
    {
        return length;
    }

    @Override
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
}
