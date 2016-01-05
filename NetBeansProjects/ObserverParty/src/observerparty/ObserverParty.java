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
public class ObserverParty {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("The party needs a message!");
      System.exit(1);
    }
    
    String message = args[0];
    
    ObservableSubject<String> broadcaster = new ObservableSubject<>();

    broadcaster.registerObserver(new SommerPrinter());
    broadcaster.registerObserver(new CicchettiPrinter());
    broadcaster.notifyObservers(message);
  }
}
