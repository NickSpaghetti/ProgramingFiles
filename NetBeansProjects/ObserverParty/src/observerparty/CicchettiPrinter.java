/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerparty;

/**
 *
 * @author nicholascicchetti
 */
public class CicchettiPrinter implements Observer<String> {
    @Override
    public void notify(String notification) {
        String str = notification + " ohhhhhhhh boyyyyy!";
        System.out.println(str);
    }
}

