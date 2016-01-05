package edu.moravian.coleman;

import edu.moravian.BoardMarks;
import edu.moravian.Location;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mebjc01
 */
public class BoardMarksTest
{

    /**
     * This helper method is used in the testCounts method to count
     * the number of neighbors reutrned for each
     * @param b
     * @param count
     * @param loc
     */
    private void assertCount(BoardMarks b, int count, Location loc)
    {
        int c = 0;
        for(Location l : b.getNeighbors(loc))
        {
            c++;
        }

        assertEquals(count, c);
    }
    
    @Test
    public void testCountsNoMarks()
    {
        // This test makes sure that the correct number of Locations
        // are in the Iterable when nothing is marked.  Corners have 3
        // neighbors, non-corner edges have 5, and middle locations have 8.
        BoardMarks b = new BoardMarks();

        // corners
        assertCount(b, 3, new Location(0, 0));
        assertCount(b, 3, new Location(0, 3));
        assertCount(b, 3, new Location(3, 0));
        assertCount(b, 3, new Location(3, 0));

        // edges
        assertCount(b, 5, new Location(0, 1));
        assertCount(b, 5, new Location(0, 2));
        assertCount(b, 5, new Location(1, 0));
        assertCount(b, 5, new Location(2, 0));
        assertCount(b, 5, new Location(1, 3));
        assertCount(b, 5, new Location(2, 3));
        assertCount(b, 5, new Location(3, 1));
        assertCount(b, 5, new Location(3, 2));

        // middles
        assertCount(b, 8, new Location(1, 1));
        assertCount(b, 8, new Location(1, 2));
        assertCount(b, 8, new Location(2, 1));
        assertCount(b, 8, new Location(2, 2));
    }

    @Test
    public void testMiddleValuesNoMarks()
    {
        // This is not exclusive, but representative.

        BoardMarks b = new BoardMarks();

        Location loc = new Location(1, 1);

        // Since the return value isn't the list, we have to
        // save them and then compare.
        ArrayList<Location> locs = new ArrayList<Location>();

        for(Location l : b.getNeighbors(loc))
        {
            locs.add(l);
        }

        assertTrue(locs.contains(new Location(0, 0)));
        assertTrue(locs.contains(new Location(0, 1)));
        assertTrue(locs.contains(new Location(0, 2)));
        assertTrue(locs.contains(new Location(1, 0)));
        assertTrue(locs.contains(new Location(1, 2)));
        assertTrue(locs.contains(new Location(2, 0)));
        assertTrue(locs.contains(new Location(2, 1)));
        assertTrue(locs.contains(new Location(2, 2)));
    }

    @Test
    public void testCornerValuesNoMarks()
    {
        // THis is not exclusive, but represenative.
        
        BoardMarks b = new BoardMarks();

        Location loc = new Location(3, 3);

        ArrayList<Location> locs = new ArrayList<Location>();

        for(Location l : b.getNeighbors(loc))
        {
            locs.add(l);
        }

        assertTrue(locs.contains(new Location(2, 2)));
        assertTrue(locs.contains(new Location(2, 3)));
        assertTrue(locs.contains(new Location(3, 2)));

    }

    @Test
    public void testEdgeValuesNoMarks()
    {
        // This is representive, not exhaustive...
        
        BoardMarks b = new BoardMarks();

        Location loc = new Location(2, 0);
        b.mark(loc);

        ArrayList<Location> locs = new ArrayList<Location>();

        for(Location l : b.getNeighbors(loc))
        {
            locs.add(l);
        }

        assertTrue(locs.contains(new Location(1, 0)));
        assertTrue(locs.contains(new Location(1, 1)));
        assertTrue(locs.contains(new Location(2, 1)));
        assertTrue(locs.contains(new Location(3, 0)));
        assertTrue(locs.contains(new Location(3, 1)));
    }

    @Test
    public void testZeroCounts()
    {
        BoardMarks b = new BoardMarks();

        for(int row = 0; row < 4; row++)
        {
            for(int col = 0; col < 4; col++)
            {
                b.mark(new Location(row, col));
            }
        }

        for (int row = 0; row < 4; row++)
        {
            for(int col = 0; col < 4; col++)
            {
                assertCount(b, 0, new Location(row, col));
            }
        }
    }

    @Test
    public void testMiddleValuesMarks()
    {
        // This is not exclusive, but representative.

        BoardMarks b = new BoardMarks();

        Location loc = new Location(2, 1);

        b.mark(new Location(1, 0));
        b.mark(new Location(3, 2));

        // mark and unmark one to make sure...
        b.mark(new Location(2, 2));
        b.unmark(new Location(2, 2));

        // Since the return value isn't the list, we have to
        // save them and then compare.
        ArrayList<Location> locs = new ArrayList<Location>();

        for(Location l : b.getNeighbors(loc))
        {
            locs.add(l);
        }

        assertFalse(locs.contains(new Location(1, 0)));
        assertTrue(locs.contains(new Location(1, 1)));
        assertTrue(locs.contains(new Location(1, 2)));
        assertTrue(locs.contains(new Location(2, 0)));
        assertTrue(locs.contains(new Location(2, 2)));
        assertTrue(locs.contains(new Location(3, 0)));
        assertTrue(locs.contains(new Location(3, 1)));
        assertFalse(locs.contains(new Location(3, 2)));
    }

    @Test
    public void testCornerValuesMarks()
    {
        // THis is not exclusive, but represenative.

        BoardMarks b = new BoardMarks();

        Location loc = new Location(3, 0);

        b.mark(new Location(2, 1));

        b.mark(new Location(3, 1));
        b.unmark(new Location(3, 1));

        ArrayList<Location> locs = new ArrayList<Location>();

        for(Location l : b.getNeighbors(loc))
        {
            locs.add(l);
        }

        assertTrue(locs.contains(new Location(2, 0)));
        assertFalse(locs.contains(new Location(2, 1)));
        assertTrue(locs.contains(new Location(3, 1)));

    }

    @Test
    public void testEdgeValuesMarks()
    {
        // This is representive, not exhaustive...

        BoardMarks b = new BoardMarks();

        Location loc = new Location(0, 2);

        b.mark(new Location(0, 1));
        b.mark(new Location(0, 3));

        b.mark(new Location(1, 2));
        b.unmark(new Location(1, 2));


        ArrayList<Location> locs = new ArrayList<Location>();

        for(Location l : b.getNeighbors(loc))
        {
            locs.add(l);
        }

        assertFalse(locs.contains(new Location(0, 1)));
        assertFalse(locs.contains(new Location(0, 3)));
        assertTrue(locs.contains(new Location(1, 1)));
        assertTrue(locs.contains(new Location(1, 2)));
        assertTrue(locs.contains(new Location(1, 3)));
    }
}