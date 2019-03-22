/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kasper Jeppesen
 */
public class UserDAO
{
    public static User getUser(String username)
    {
        String username_ = "";
        String password = "";
        float balance = 0;
        int isAdmin = 0;
        
        try
        {
            DBConnector con = new DBConnector();
            Statement statement = con.getConnection().createStatement();
            String query
                    = "SELECT * "
                    + "FROM user "
                    + "WHERE username = '" + username + "';";
            ResultSet rs = statement.executeQuery(query);

            if (rs.next()) {
                username_ = rs.getString("username");
                password = rs.getString("password");
                balance = rs.getFloat("balance");
                isAdmin = rs.getInt("isAdmin");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return new User(username_, password, balance, isAdmin);
    }
    
    public static void insertUser(String name, String password, float balance) {
        try {
            DBConnector conn = new DBConnector();
            Statement statement = conn.getConnection().createStatement();
            String query
                    = "INSERT INTO user(username, password, balance, isAdmin) "
                    + "VALUES ('"+ name + "', '" + password + "', " + balance + ", 0);";
            statement.executeUpdate(query);

        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public static void setBalance(String username, float balance)
    {
        try 
        {
            DBConnector conn = new DBConnector();
            Statement statement = conn.getConnection().createStatement();
            String query
                    = "UPDATE user SET balance = " 
                    + balance + " WHERE username = '" + username + "';" ;
            statement.executeUpdate(query);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
