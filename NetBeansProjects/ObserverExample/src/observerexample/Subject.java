/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

import java.util.HashSet;

public abstract class Subject<E>//this is how you define an Generic
{
  private HashSet<Observer<E>> hs = new HashSet<>(); //takes in Observer objs that are Generic
  
  
  
  protected void notifyObservers(E notification)
  {
      
      for(Observer obs : hs)
          obs.notify(notification);
  }
  
  public void registerObserver(Observer obs)
  {
      hs.add(obs);
  }
  
  public void removeObserver(Observer obs)
  {
      hs.remove(obs);
  }
}
