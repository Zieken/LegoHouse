/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Statement;
import java.text.SimpleDateFormat;
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
}
