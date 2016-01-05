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
public class SommerPrinter implements Observer<String> {
  @Override
  public void notify(String notification) {
    String str = notification + " Yippeeee!!!";
    System.out.println(str);
  }
}
