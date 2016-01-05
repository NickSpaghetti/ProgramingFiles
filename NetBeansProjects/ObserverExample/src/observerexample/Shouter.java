/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

/**
 *
 * @author nicholascicchetti
 */
public class Shouter implements Observer<String>
{
    @Override
    public void notify(String notification)
    {
       System.out.println(notification.toUpperCase());
    } 
}
