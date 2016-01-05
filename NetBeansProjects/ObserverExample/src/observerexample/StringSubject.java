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
public class StringSubject extends Subject<String>//this is the Generic all the notfcations will be of type STring
{

    public void sendNotification(String s)
    {
        notifyObservers(s);
    }

}
