/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cadenhead.ecommerce;
import java.util.*;

/**
 *
 * @author Nick
 */
public class Storefront
{
    private LinkedList catalog = new LinkedList();
    
    public void addItem(String id, String name, String price, String quant, String dis)
    {
        Item it = new Item(id,name,price,quant,dis);
        catalog.add(it);
    }
    
    public Item getItem(int i)
    {
        return (Item)catalog.get(i);
    }
    
    public int getSize()
    {
        return catalog.size();
    }
    
    
    public void sort()
    {
        Collections.sort(catalog);
    }
    
}
