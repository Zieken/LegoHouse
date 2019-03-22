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
public class User
{
       private String username;
    private String password;
    private float balance;
    private int isAdmin;

    public User(String username, String password, float balance, int isAdmin) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public float getBalance() {
        return balance;
    }

    public int getIsAdmin() {
        return isAdmin;
    }
    
    public void setBalance(float balance) {
        this.balance = balance;
    }
}
