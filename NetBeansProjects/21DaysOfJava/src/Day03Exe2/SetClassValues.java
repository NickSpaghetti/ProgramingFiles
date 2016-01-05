/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day03Exe2;

/**
 *
 * @author Nick
 */
public class SetClassValues
{
   private double height,weight,depth;
   public SetClassValues(double newHeight, double newWeight, double newDepth)
   {
       height = newHeight;
       weight = newWeight;
       depth = newDepth;
   }
   
   public double DisplayHeight()
   {
       return height;
   }
   
   public double DisplayWeight()
   {
       return weight;
   }
   
   public double DisplayDepth()
   {
       return depth;
   }
}
