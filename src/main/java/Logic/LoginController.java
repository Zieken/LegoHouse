/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.User;
import Data.UserDAO;

/**
 *
 * @author Kasper Jeppesen
 */
public class LoginController
{
    public static boolean isValid(String username, String password)
    {
        if(username == null || username.isEmpty()) { return false; }
        if(password == null || password.isEmpty()) { return false; }
        
        User user = UserDAO.getUser(username);
        //return true if password given in the parameter matches the user, gotten from the database, password
        return password.equals(user.getPassword());
    }
    public static User getUser(String username)
    {
        return UserDAO.getUser(username);
    }
}
