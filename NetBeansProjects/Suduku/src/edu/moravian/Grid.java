/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.io.FileNotFoundException;
import java.lang.String;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.lang.Object;
import java.lang.IndexOutOfBoundsException;
import java.io.Serializable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.lang.IllegalStateException;
import java.io.*;

/**
 * This class represents the 9 by 9 grid of a sudoku puzzle. Consistent with
 * standard practices for computer science, row and column numbers are 0-based.
 * This means the indexes for various methods will have values in the range [0,
 * 9).
 *
 * The main invariant for this class is that the grid is always legal. This
 * means that each row, column, and 3x3 sub-grid only contains the values 1
 * through 9 a single time.
 *
 * Blank cells are given the value 0.
 *
 * @author mebjc01
 */
public class Grid
{

    private final int[][] grid;
    int value;
    int value2;
    public final int clearValue = 0;
    private Exception IOException;

    /**
     * Create a new grid with all values set to zero.
     */
    public Grid()
    {
        System.out.println("This is your blank grid");
        grid = new int[9][9];
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid.length; col++)
            {
                System.out.print(grid[0][0] = 0);
            }
            System.out.println(" ");
        }

    }

    /**
     * Create a grid based on the contents of the specified file. The file is
     * assumed to be made up of 9 row with each row containing 9 values
     * separated by spaces. Any row beginning with a # character is treated as a
     * comment and ignored.
     *
     * @param filename the file to read
     * @throws FileNotFoundException if the file cannot be opened.
     * @throws FileFormatException if the file does not match the described
     * format (too many rows, too few rows, or wrong number of values in a row)
     * - or if the data in the file does not represent a valid Sudoku grid.
     */
    public Grid(String filename) throws FileNotFoundException, IOException, FileFormatException
    {
        grid = new int[9][9];
        int t = 0;
        int l = 0;
        int row = 0;

        String s;

        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        System.out.println("This is your new Grid");
        try
        {
            while (row < 9)
            {
                if ((s = fileReader.readLine()) != null)
                {

                    String[] splitted = s.split(" ");
                // ignore blank lines
                    // continue will cause the program to stop executing this iteration
                    // of the body and re-evaluate the condition.
                    if (s.length() == 0 || s.startsWith("#"))
                    {

                    }
                    else
                    {

                        for (int col = 0; col < 9; col++)
                        {
                            int part = Integer.parseInt(splitted[col]);
                            this.setValue(row, col, part);
                            System.out.print(grid[row][col]);
                            
                        }
                        System.out.print(" ");
                        row++;
                    }
                }

            }

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Too Few Lines");
        }
        catch (IOException ex)
        {
            System.out.print("IOEXCEPTION");
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Your Array is out of bounds!");
        }
        catch (NumberFormatException ex)
        {
            System.out.println("You can only store integers in this array");
        }

    }

    /**
     * Get the current value in the specified cell of the grid.
     *
     * @param row the row in the range [0, 9)
     * @param col the column in the range [0, 9)
     * @return The value in the cell, a number in the range [1, 9] or the value
     * 0 if the cell is empty.
     * @throws IndexOutOfBoundsException if row or col are outside the range [0,
     * 9).
     */
    public int getValue(int row, int col)
    {
        if (row > 8 && row < 0 || col > 8 && col < 0)
        {
            throw new IndexOutOfBoundsException("You can not input any row, col, or values > 10");
        }

        return grid[row][col];
    }

    /**
     * Determine if the specified cell can legally be set to the specified
     * value.
     *
     * @param row the row in the range [0, 9)
     * @param col the column in the range [0, 9)
     * @param value the value to check.
     * @return True if it is legal to set the cell to the value, false
     * otherwise.
     * @throws IndexOutOfBoundsException if row or col is outside the range [0,
     * 9).
     * @throws java.io.IOException
     * @throws IllegalArgumentException if value is outside the range [1, 9].
     */
    
    public boolean isLegalSet(int row, int col, int value)
    {
        if (row > 8 && row < 0 || col > 8 && col < 0 || value > 9 && value < 9)
        {
            throw new IndexOutOfBoundsException("You can not input any row >= 9, col >= 9, or values >= 10");
        }
            // Check that the rows contain no duplicate values
            for (int i = 0; i < grid.length; ++i)
            {
                if (!checkRow(grid, i))
                {
                    return false;
                }
            }

            // Check that the columns contain no duplicate values
            for (int j = 0; j < grid.length; ++j)
            {
                if (!checkCol(grid, j))
                {
                    return false;
                }
            }
      

        return true;
    }

    public boolean checkRow(int[][] grid, int row)
    {
        final int size = grid.length;
        boolean[] found = new boolean[size];
        for (int col = 0; col < size; ++col)
        {
            // set found[x - 1] to be true if we find x in the row
            int index = grid[row][col] - 1;
            if (!found[index])
            {
                found[index] = true;
            }
            else
            {
                // found it twice, so return false
                return false;
            }
        }
        return true;
    }

    public boolean checkCol(int[][] grid, int col)
    {
        final int size = grid.length;
        boolean[] found = new boolean[size];
        for (int row = 0; row < size; ++row)
        {

            int index = grid[row][col] - 1;
            if (!found[index])
            {
                found[index] = true;
            }
            else
            {

                return false;
            }

        }
        return true;
    }

    public boolean checkSquare(int[][] grid, int row, int col)
    {
        boolean[] hit = new boolean[10];

        for (int r = row; r < row + 3; r++)
        {
            for (int c = col; c < col + 3; c++)
            {

                if (hit[grid[r][c]])
                {
                    
                }

                hit[grid[r][c]] = true;
            }
        }
        return true;
    }

    /**
     * Set the specified cell in the grid with the specified value. Values
     * should be in the range [0, 9)
     *
     * @param row the row in the range [0, 9)
     * @param col the column in the range [0, 9)
     * @param value the value in the range [1, 9]
     * @throws IndexOutOfBoundsException if row or col is outside the range [0,
     * 9).
     * @throws IllegalArgumentException if value is outside the range [1, 9].
     * @throws IllegalArgumentException if setting the value would invalidate
     * the grid.
     */
    public void setValue(int row, int col, int value) 
    {
        //System.out.println("You are now in the setValue method");
        try
        {
            if (row > 8 || row <= 0 && col > 8 || col <= 0 && value > 9 || value < 1)
            {
                System.out.println("You can not input any row > 9, col > 9, or values > 10");
                throw new IndexOutOfBoundsException("You can not input any row > 9, col > 9, or values > 10");
            }
            for (int r = 0; r < row; r++)
            {
                for (int c = 0; c < col; c++)
                {
                    System.out.print(grid[r][c]);
                }
                r++;
                grid[r][col] = value;
                System.out.print(" ");
            }
            System.out.println(" ");
            grid[row][col] = value;
            System.out.print(grid[row][col] = value);
            System.out.println("You are now leaving the setValue method");
        }
        catch(IndexOutOfBoundsException ex)
        {
            
        }
    }

    /**
     * Clear the specified cell by settings its value to 0.
     *
     * @param row the row in the range [0, 9)
     * @param col the column in the range [0, 9)
     * @throws IndexOutOfBoundsException if row or col is outside the range [0,
     * 9).
     */
    public void clearValue(int row, int col)  //clear specified cell by setting its values to 0.
    {

        int tmpR = 0;
        int tmpC = 0;
        int counter = 0;
        try
        {

            if (row > 8 || col > 8)
            {
                System.out.println("You can not input any row > 8, col > 8");

            }
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("You can not input any row > 8, col > 8");
        }

        System.out.println("You are here");
        System.out.println(grid[row][col]);
        System.out.println("You are here");

        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c < col; c++)
            {
                grid[c][row] = clearValue;
                System.out.print(grid[r][c]);
            }
            System.out.println(" ");
            grid[r][col] = clearValue;

        }
        System.out.println(" Your value");

        //System.out.print(grid[row][col]);
    }

    public void reset()
    {
        //System.out.println("You are now in the reset method");
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid.length; col++)
            {
                System.out.print(grid[row][col]);
            }
            System.out.println(" ");
        }

        //System.out.println("You are now leaving the reset Method");
    }

    /**
     * This method saves the grid to the specified file. The format of the file
     * is 9 lines, with each line containing 9 values separated by spaces.
     *
     * @param filename the file to write to.
     * @throws IOException if the file cannot be opened for write or if an error
     * occurs while writing.
     */
    public void save(String filename) throws IOException
    {
        PrintWriter out = new PrintWriter(filename);

        try
        {
            for (int z = 0; z < grid.length; z++)
            {
                for (int x = 0; x < grid.length; x++)
                {
                    out.print(grid[z][x] + " ");
                }
                out.println(" ");
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

    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder();
        b.append("\n");

        for (int row = 0; row < 9; row++)
        {
            if (row % 3 == 0 && row != 0)
            {
                b.append("-----------\n");
            }

            for (int col = 0; col < 9; col++)
            {
                if (col % 3 == 0 && col != 0)
                {
                    b.append("|");
                }
                b.append(grid[row][col]);
            }

            b.append("\n");

        }

        return b.toString();
    }

}
