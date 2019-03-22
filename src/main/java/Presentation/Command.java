/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kasper Jeppesen
 */
public abstract class Command
{
    public abstract void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    
    public static Command from(HttpServletRequest request)
    {
        Command c;
        //stores the value of the parameter in origin
        String origin = request.getParameter("command");
        
        Map<String, Command> commands = new HashMap();
        
        commands.put("register", new RegisterCommand());
        commands.put("login", new LoginCommand());
        commands.put("increaseTheBalance", new AddMoneyCommand());
        commands.put("makeOrder", new makeOrderCommand());
        
        //Searches for a map key which match the vaule of origin,if found it returns the value of that map key. Otherwise it creates a new UnknownCommand
        c = commands.getOrDefault(origin, new UnknownCommand());
        return c;
    }
}
