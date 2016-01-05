/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readandwrite;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;

/**
 *
 * @author nicholascicchetti
 */
public class ReadandWrite
{
    
    public static void main(String[] args)
    {
       {
        try
        {
            LinearCollection l = new LinearCollection("/Users/nicholascicchetti/NetBeansProjects/ReadandWrite/src/readandwrite/data");
            
            System.out.println("Read " + l.numValues() + " values.");
            
            for(int i = 0; i < l.numValues(); i++)
            {
                System.out.println(l.getValue(i));
            }

        }
        catch (IOException ex)
        {
            System.out.println("could not file data.dat");
            return;
        }
        
    }
    
} // TODO code application logic here
    }
   
