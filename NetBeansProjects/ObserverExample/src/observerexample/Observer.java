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
public interface Observer<E> // this is how you define an Generic
{
 public void notify(E notification); // this is a Generic
}
