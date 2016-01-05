/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readandwrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mebjc01
 */
public class LinearCollection
{
    private ArrayList<Integer> values;

    public LinearCollection(String filename) throws FileNotFoundException, IOException
    {
        values = new ArrayList<>();

        BufferedReader in = new BufferedReader(new FileReader(filename));
        Scanner s = new Scanner(in);

        try
        {
            while (s.hasNextInt())
            {
                int val = s.nextInt();
                values.add(val);
            }

            IOException e = s.ioException();
            if (e != null)
            {
                throw e;
            }
        }
        finally
        {
            s.close();
        }
    }

    public int numValues()
    {
        return values.size();
    }

    public int getValue(int index)
    {
        if (index < 0 || index >= values.size())
        {
            throw new DumbassException("You cannot access data that isn't there!");
        }

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

