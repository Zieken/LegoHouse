/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.RegisterController;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kasper Jeppesen
 */
public class RegisterCommand extends Command
{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        RegisterController.insertUser(username, password, 0);
        
        response.sendRedirect("/legohus2/registerSuccesfull.jsp");
    }
    
}
