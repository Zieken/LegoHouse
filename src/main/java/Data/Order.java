/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Date;

/**
 *
 * @author Kasper Jeppesen
 */
public class Order
{
    private final int orderId;
    private String username;
    private Date datePlaced;
    private String status;
    
    public Order(int orderId, String username, Date datePlaced, String status)
    {
        this.orderId = orderId;
        this.username = username;
        this.datePlaced = datePlaced;
        this.status = status;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public String getUsername()
    {
        return username;
    }

    public Date getDatePlaced()
    {
        return datePlaced;
    }

    public String getStatus()
    {
        return status;
    }
}
