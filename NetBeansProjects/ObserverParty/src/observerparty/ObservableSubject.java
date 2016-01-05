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
import java.util.HashSet;

public class ObservableSubject<E> {
  private HashSet<Observer<E>> observers = new HashSet<>();
  
  protected void notifyObservers(E notification) {
    for (Observer obs : observers)
      obs.notify(notification);
  }
  
  public void registerObserver(Observer obs) {
    observers.add(obs);
  }
  
  public void removeObserver(Observer obs) {
    observers.remove(obs);
  }
}
