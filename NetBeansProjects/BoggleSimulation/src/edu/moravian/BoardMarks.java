package edu.moravian;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class keeps track of which locations of the board are currently being
 * used (marked), and based on this information provides iterable lists of
 * neighbors.
 *
 * @author @author nicholascicchetti
 */
public class BoardMarks
{

    private boolean[][] marked = new boolean[4][4];

    //BoardMarks Check = new BoardMarks();
    /**
     * Create a new instance with all locations unmarked.
     */
    public BoardMarks()
    {

        for (int i = 0; i < marked.length; i++)
        {

            for (int j = 0; j < marked.length; j++)
            {

                marked[i][j] = false;

            }

        }
    }

    /**
     * Mark the specified location
     *
     * @param loc the location to mark
     * @throws IllegalStateException if the location is already marked.
     */
    public void mark(Location loc)
    {

        if (marked[loc.getRow()][loc.getCol()] == true)
        {
            throw new IllegalStateException("This Letter is already Marked");
        }
            marked[loc.getRow()][loc.getCol()] = true;
    }

    /**
     * Unmark the specified location
     *
     * @param loc the location to unmark
     * @throws IllegalStateException if the location is not marked
     */
    public void unmark(Location loc)
    {

        if (!marked[loc.getRow()][loc.getCol()] == true)
        {
            throw new IllegalStateException("This Letter is not Marked");
        }

            marked[loc.getRow()][loc.getCol()] = false;
    }

    /**
     * Get an iterable "list" of unmarked neighbors. This method is intended to
     * be used with the for each construct: for(Location l :
     * b.getNeighbors(loc))
     *
     * @param loc the location to get neighbors for
     * @return an iterable list of neighbors (possibly empty)
     */
    public Iterable<Location> getNeighbors(Location loc)
    {
        LinkedList<Location> ret = new LinkedList<>();
        BoardMarks bm = new BoardMarks();
   

        if(checkTopRight(loc))
        {
           ret.add(new Location(loc.getRow()-1, loc.getCol() + 1));
        }
         if(checkTopLeft(loc))
         {
           ret.add(new Location(loc.getRow()-1, loc.getCol() -1));   
         }
          if(checkDiagonalLeft(loc))
          {
              ret.add(new Location(loc.getRow()+1, loc.getCol() -1));
          }
           if(checkDiagonalRight(loc))
           {
               ret.add(new Location(loc.getRow()+1, loc.getCol() +1));
           }
            if(checkMiddleRight(loc))
            {
               ret.add(new Location(loc.getRow(), loc.getCol() +1)); 
            }
             if(checkMiddleLeft(loc))
             {
                 ret.add(new Location(loc.getRow(), loc.getCol() -1));
             }
              if(checkUp(loc))
              {
                 ret.add(new Location(loc.getRow()-1, loc.getCol()));
              }
               if(checkDown(loc))
               {
                   ret.add(new Location(loc.getRow()+1, loc.getCol()));
               }
        return ret;
    }

    private boolean checkTopRight(Location loc)
    {

        int row = loc.getRow();
        int col = loc.getCol();
        
        if(row == 0 || col == 3)
        {
            return false;
        }

        return !marked[row - 1][col + 1]; // returns the oppisit so for the ifstatements in getNeighbors if its false theres no need to run them.
    }

    private boolean checkTopLeft(Location loc)
    {

        int row = loc.getRow();
        int col = loc.getCol();
        
        if(row == 0 || col == 0)
        {
            return false;
        }

        return !marked[row - 1][col - 1]; // returns the oppisit so for the ifstatements in getNeighbors if its false theres no need to run them.
    }

    private boolean checkDiagonalLeft(Location loc)
    {
        int row = loc.getRow();
        int col = loc.getCol();
        
        if(row == 3|| col == 0)
        {
            return false;
        }

        return !marked[row + 1][col - 1]; // returns the oppisit so for the ifstatements in getNeighbors if its false theres no need to run them.
    }

    private boolean checkDiagonalRight(Location loc)
    {
        int row = loc.getRow();
        int col = loc.getCol();
        if(row == 3 || col == 3)
        {
            return false;
        }

        return !marked[row + 1][col + 1]; // returns the oppisit so for the ifstatements in getNeighbors if its false theres no need to run them.
    }

    private boolean checkMiddleRight(Location loc)
    {
        int row = loc.getRow();
        int col = loc.getCol();
        if(col == 3)
        {
            return false;
        }

        return !marked[row][col + 1]; // returns the oppisit so for the ifstatements in getNeighbors if its false theres no need to run them.
    }

    private boolean checkMiddleLeft(Location loc)
    {
        int row = loc.getRow();
        int col = loc.getCol();
        
        if(col == 0)
        {
            return false;
        }

        return !marked[row][col - 1]; // returns the oppisit so for the ifstatements in getNeighbors if its false theres no need to run them.
    }

    private boolean checkUp(Location loc)
    {
        int row = loc.getRow();
        int col = loc.getCol();
        
        if(row == 0)
        {
            return false;
        }

        return !marked[row - 1][col]; // returns the oppisit so for the ifstatements in getNeighbors if its false theres no need to run them.
    }

    private boolean checkDown(Location loc)
    {
        int row = loc.getRow();
        int col = loc.getCol();
        
        if(row == 3)
        {
            return false;
        }

        return !marked[row + 1][col]; // returns the oppisit so for the ifstatements in getNeighbors if its false theres no need to run them.
    }

}
