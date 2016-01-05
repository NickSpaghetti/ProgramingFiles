/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncdriverandomsequence;

import java.util.Random;

public class RandomSequenceGaussian //extends RandomSequence 
{
  private final Random rand = new Random();
  
 // @Override
  public double next() {
   // while (pos >= sequence.size())
     // sequence.add(rand.nextGaussian());

    return 0; //sequence.get(pos++);
  }
}
