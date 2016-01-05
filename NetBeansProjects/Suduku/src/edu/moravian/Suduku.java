/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 *
 * @author nicholascicchetti
 */
public class Suduku
{

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException
    {
        Grid g = new Grid();
        int arry[][] = new int[9][9];
        int k = 1;
        int t = 0;
        int l = 0;
        int testrow = 0;
        int value = 1;
        int getrow = 1;
        int getcol = 1;
        int value2;
        int grid[][] = new int[9][9];

        for (int row = 0; row < arry.length; row++)
        {
            for (int col = 0; col < arry.length; col++)
            {
                System.out.print(arry[row][col]);
            }

            System.out.print("|");
        }
        System.out.println(" ");
        System.out.println("Start check row");

        for(int dumb = 0; dumb < arry.length; dumb++)
        {
            for(int malarky = 0; malarky < arry.length; malarky++)
            {
                System.out.print(arry[dumb][malarky]);
            }
            System.out.println(" ");
        }
        
        System.out.println("**************************");
        
        for (int r = 0; r < getrow; r++)
        {
            for (int c = 0; c < getcol; c++)
            {
                System.out.print(arry[r][c]);
            }
            r++;
            arry[r][getcol] = value;
            System.out.print(" ");
            
        }
        System.out.println(" ");
        System.out.println("end check row");
        System.out.println("***Start of Get Value***");
        for (int r = 0; r < getrow; r++)
        {
            for (int c = 0; c < getcol; c++)
            {
                //System.out.print(arry[r][c]);
            }
            r++;
            value2 = arry[getrow][getcol];
            System.out.print(" ");
            System.out.println(value2);
            
        }
        System.out.println("***End of Get Value***");
        
        try
        {
            String s;
            
            BufferedReader fileReader = new BufferedReader(new FileReader("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/suduku/sudukuSample"));
            while ((s = fileReader.readLine()) != null)
            {
                
                String[] splitted = s.split(" ");
                // ignore blank lines
                // continue will cause the program to stop executing this iteration
                // of the body and re-evaluate the condition.
                if (s.length() == 0)
                {
                    continue;
                }

                // ignore comments
                if (s.startsWith("#"))
                {
                    continue;
                }
               
                for(String part: splitted)
                {
                    grid[t][l]=Integer.parseInt(part);
                
                System.out.print(grid[t][l]);
                }
                System.out.println(" ");
                
            }

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Could not open file");
        }
        catch (IOException ex)
        {
            System.out.println("Error while  reading the file");
            
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("Your grid is not 9 x 9");
            return;
        }
        try
        {
            PrintWriter out = new PrintWriter(new PrintWriter("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/suduku/SudukuSampleSave"));
            for (int z = 0; z < arry.length; z++)
            {
                for (Integer val : arry[z])
                {
                    out.print(val);
                    out.print(" ");
                    System.out.print(val);

                }
                out.println(" ");
                System.out.println(" ");
            }

            if (out.checkError())
            {
                throw new IOException("Error while writing file");
            }
            out.close();
        }
        finally
        {
            return;
        }

    }
}
