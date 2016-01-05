/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncdriverandomsequence;

import java.util.ArrayList;

public class RandomSequence 
{
  private ArrayList<Double> sequence = new ArrayList<>();
  private int pos = 0;
  private NumberGenerator randomGen;
  
    //Constructor 
    public RandomSequence(NumberGenerator gen){
       
            randomGen = gen;   
    }  
  public int getPos() {
    return pos;
  }
  
  public void seek(int pos) {
    this.pos = pos;
  }

  public double next(){
      while (pos >= sequence.size())
      sequence.add(randomGen.next());

    return sequence.get(pos++);
      
  }
  
}

