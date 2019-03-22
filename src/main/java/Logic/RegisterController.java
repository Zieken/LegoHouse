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
public class RegisterController
{
    public static void insertUser(String username, String password, float balance)
    {
        UserDAO.insertUser(username, password, 0);
    }
}
