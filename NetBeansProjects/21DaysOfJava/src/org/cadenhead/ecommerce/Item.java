/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cadenhead.ecommerce;

/**
 *
 * @author Nick
 */
public class Item implements Comparable
{
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private boolean noDiscount;
    
    Item(String idIn, String nameIn, String retailIn, String quanIn, String discountIn)
    {
        this.id = idIn;
        this.name = nameIn;
        this.retail = Double.parseDouble(retailIn);
        this.quantity = Integer.parseInt(quanIn);
        if(discountIn.equals("True"))
        {
            noDiscount = true;
        }else{
            noDiscount = false;
        }
        
        if (quantity > 400){
            price = retail * .5D;
        } else if (quantity > 200){
            price = retail * .6D;
        }else{
            price = retail * .7D;
        }
        price = Math.floor(price * 100 + .5)/(100);
        if(noDiscount == true)
        {
            price = retail;
        }
    }
    
    @Override
    public int compareTo(Object obj)
    {
        Item temp = (Item)obj;
        if(this.price < temp.price){
            return 1;
        } else if (this.price < temp.price){
            return -1;
        }
        return 0;
    }
        
    public String getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getRetail()
    {
        return retail;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public boolean getDiscount()
    {
        return noDiscount;
    }
            
          
            
    
}
