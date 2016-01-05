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
public interface Observer<E> {
  public void notify(E notification);
}