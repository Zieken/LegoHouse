/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.User;
import Logic.LoginController;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kasper Jeppesen
 */
public class LoginCommand extends Command
{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        User user = null;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(LoginController.isValid(username, password))
        {
            user = LoginController.getUser(username);
            //creates a session
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("/legohus2/index.jsp");
        }
        else
        {
            //creates a new session and set its attribute
            request.getSession().setAttribute("LoginResult", "LoginFailed");
            
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
    }
    
}
