/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day06Exe1;
import org.cadenhead.ecommerce.Item;
import org.cadenhead.ecommerce.Storefront;

/**
 *
 * @author Nick
 */
public class GiftShop 
{
    public static void main(String[] arguments)
    {
        Storefront store = new Storefront();
        store.addItem("C01", "MUG", "9.99", "150", "True");
        store.addItem("C02", "LG MUG", "12.99", "82", "False");
        store.addItem("C03", "Mouse Pad", "10.49", "800", "True");
        store.addItem("D01", "T SHIRT", "16.99", "90", "False");
        
        for (int i = 0; i < store.getSize(); i++)
        {
            Item show = (Item)store.getItem(i);
            System.out.println("\n Item ID: " + show.getID() + "\n Name: " + show.getName() + "\n Price: " + show.getRetail() + "\n Quantity: " + show.getQuantity() + "\n Discount: " +show.getDiscount());
        }
    }   
}
