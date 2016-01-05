/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

import java.util.ArrayList;

/**
 *
 * @author nicholascicchetti
 */
public class ObserverExample
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        StringSubject sb = new StringSubject();
        Wisperer w = new Wisperer();
        Shouter s = new Shouter();
        sb.registerObserver(w);
        sb.registerObserver(s);

        sb.notifyObservers("Hello");
        
        sb.removeObserver(s);
        
        sb.notifyObservers("Goodbye");
        
        
            
        
    }
    
}
