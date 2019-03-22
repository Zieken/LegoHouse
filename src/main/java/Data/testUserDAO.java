/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.LoginController;

/**
 *
 * @author Kasper Jeppesen
 */
public class testUserDAO
{
    public static void main(String[] args)
    {
        //UserDAO.insertUser("Robin", "førsteTest", 0);
        User u = UserDAO.getUser("tom");
        System.out.println(u.getUsername());
        System.out.println(u.getPassword());
        System.out.println(u.getBalance());
        System.out.println(u.getIsAdmin());
        
        LoginController.getUser("tom");
        System.out.println(u.getUsername());
        System.out.println(u.getPassword());
        System.out.println(u.getBalance());
        System.out.println(u.getIsAdmin());
        
    }
}
