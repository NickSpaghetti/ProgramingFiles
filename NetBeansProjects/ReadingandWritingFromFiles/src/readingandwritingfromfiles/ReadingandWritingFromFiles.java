/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readingandwritingfromfiles;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;

/**
 *
 * @author nicholascicchetti
 */
public class ReadingandWritingFromFiles
{
    
    public static void main(String[] args)
    {
        try
        {
            LinearCollection l = new LinearCollection("/Users/nicholascicchetti/NetBeansProjects/ReadandWrite/src/readandwrite/data");
            
            for(int i = 0; i < l.numValues();i++)
            {
            System.out.println(l.getValue(i));
            }
            
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Could not open file");
        }
        catch (IOException ex)
        {
            System.out.println("Error while  reading the file");
            return;
        }
        
        
    }
    
}
