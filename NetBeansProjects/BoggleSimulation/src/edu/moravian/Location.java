/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;


/**
 * This simple immutable object represents a location in the board
 * as a row, column pair.
 * 
 * @author nicholascicchetti
 */
public class Location
{
    /**
     * Create an instance from the given values
     *
     * @throws IllegalArgumentException if row or column are outside
     * the range 0 through 3, inclusive.
     * @param row the row to represent
     * @param col the column to represent
     */
    
    int newRow, newCol;
    public Location(int row, int col)
    {
        
        if (row < 0 || row > 3)
        {
            throw new IllegalArgumentException("You can not have a row > 0 or < 4");
        }   
        newRow = row;
          
        if (col < 0 || col > 3)
        {
           throw new IllegalArgumentException("You can not have a col > 0 or < 4"); 
        }
        newCol = col; 
        
    }

    /**
     * Get the column
     * @return an integer between 0 and 3, inclusive
     */
    public int getCol()
    {
        
        return newCol;
    }

    /**
     * Get the row
     * @return an integer between 0 and 3, inclusive
     */
    public int getRow()
    {
        return newRow;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.newRow != other.newRow) {
            return false;
        }
        if (this.newCol != other.newCol) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 97 * hash + this.newRow;
        hash = 97 * hash + this.newCol;
        return hash;
    }
    
    
}

