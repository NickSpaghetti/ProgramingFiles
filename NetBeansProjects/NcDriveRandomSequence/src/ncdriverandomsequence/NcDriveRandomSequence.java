  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncdriverandomsequence;

/**
 *
 * @author nicholascicchetti
 */
public class NcDriveRandomSequence
{

    public static void main(String[] args)
    {
       StringGenerator seq = new StringGenerator("ha", 1, 5);
       //RandomSequence seq = new RandomSequence(new UniformGenerator());
      //RandomSequence seq = new RandomSequence(new GaussianGenerator());
      int lineCount = 10;
    for (int i = 0; i < lineCount; ++i)
      System.out.println(seq.next());
    
    System.out.println("---");
    
    seq.seek(0);
    for (int i = 0; i < lineCount; ++i) 
      System.out.println(seq.next());

    System.out.println("---");
    
    seq.seek(0);
    for (int i = 0; i < lineCount; ++i) 
      System.out.println(seq.next());

    }
    
}
