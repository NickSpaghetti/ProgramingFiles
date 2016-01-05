/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readingandwritingfromfiles;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LinearCollection 
{
    private ArrayList<Integer> values;
    
    // constructor that thows a FileNotFoundException if no try catch is the methods are dead but the objects are uneffected.
    // how ever the constructor doesn't die it was never created.
    public LinearCollection(String filename) throws FileNotFoundException, IOException 
    {
       values = new ArrayList<>();
        
       BufferedReader in = new BufferedReader(new FileReader(filename)); //Read in chucks of a file.
       
       Scanner s = new Scanner(in); //give scanner The BufferedReader Object and to be able to read it convenuntly.
       
       
       try
       {
       while(s.hasNextInt()) //while there are more ints in the file read me one and put it in the list.   
        {
           int val = s.nextInt();
           values.add(val);
         }
       
         IOException e = s.ioException(); // while you were doing that did any thing go wrong?
         if (s != null) // if e is not null then something went wrong.
         {
             throw e; // will throw only if while reading the file there was not a null returned.
         }
       }
       finally // whats ever is in the finally will always run even the program crashes.
       {
        s.close(); //closes the file try to keep it the same method.
       }
    }

    public int numValues()
    {
        return values.size();
    }
    
        public int getValue(int index)
    {
        

        return values.get(index);
    }

    
    public void save(String filename) throws FileNotFoundException, IOException
    {
        PrintWriter out = new PrintWriter(filename);;
        
        try
        {
            for (Integer val : values)
            {
                out.print(val);
            }

            if (out.checkError())
            {
                throw new IOException("Error while writing file");
            }
        }
        finally
        {
            out.close();
        }


    }
}