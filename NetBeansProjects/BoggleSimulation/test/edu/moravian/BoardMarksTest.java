/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholascicchetti
 */
public class BoardMarksTest
{

    @Test
    public void TestLocationZeroZero()
    { //3 that should be there and 3 that should not be there
        ArrayList<Location> bmBoard = new ArrayList();
        BoardMarks b = new BoardMarks();
        Location loc = new Location(0, 0);
        for (Location l : b.getNeighbors(loc))
        {
            bmBoard.add(l);
        }
        assertEquals(3, bmBoard.size());
        assertTrue(bmBoard.contains(new Location(0, 1)));
        assertTrue(bmBoard.contains(new Location(1, 1)));
        assertTrue(bmBoard.contains(new Location(1, 0)));
        assertFalse(bmBoard.contains(new Location(2, 0)));
        assertFalse(bmBoard.contains(new Location(2, 1)));
        assertFalse(bmBoard.contains(new Location(2, 2)));
        assertFalse(bmBoard.contains(new Location(2, 3)));
        assertFalse(bmBoard.contains(new Location(0, 2)));
        assertFalse(bmBoard.contains(new Location(0, 3)));
        assertFalse(bmBoard.contains(new Location(1, 3)));
        assertFalse(bmBoard.contains(new Location(1, 2)));
        assertFalse(bmBoard.contains(new Location(3, 3)));
        assertFalse(bmBoard.contains(new Location(3, 2)));
        assertFalse(bmBoard.contains(new Location(3, 0)));
    }

    @Test
    public void TestLocationZeroOne()
    { //3 that should be there and 3 that should not be there
        ArrayList<Location> bmBoard2 = new ArrayList();
        BoardMarks b2 = new BoardMarks();
        Location loc2 = new Location(0, 1);
        for (Location l2 : b2.getNeighbors(loc2))
        {
            bmBoard2.add(l2);
        }
        assertEquals(5, bmBoard2.size());
        assertTrue(bmBoard2.contains(new Location(0, 0)));
        assertTrue(bmBoard2.contains(new Location(0, 2)));
        assertTrue(bmBoard2.contains(new Location(1, 2)));
        assertTrue(bmBoard2.contains(new Location(1, 0)));
        assertTrue(bmBoard2.contains(new Location(1, 1)));
        assertFalse(bmBoard2.contains(new Location(2, 0)));

    }
    
     @Test
    public void TestLocationZeroTwo()
    { //3 that should be there and 3 that should not be there
        ArrayList<Location> bmBoard2 = new ArrayList();
        BoardMarks b2 = new BoardMarks();
        Location loc2 = new Location(0, 2);
        for (Location l2 : b2.getNeighbors(loc2))
        {
            bmBoard2.add(l2);
        }
        assertEquals(5, bmBoard2.size());
        assertTrue(bmBoard2.contains(new Location(0, 1)));
        assertTrue(bmBoard2.contains(new Location(0, 3)));
        assertTrue(bmBoard2.contains(new Location(1, 2)));
        assertTrue(bmBoard2.contains(new Location(1, 3)));
        assertTrue(bmBoard2.contains(new Location(1, 1)));
    }
         @Test
    public void TestLocationZeroThree()
    { //3 that should be there and 3 that should not be there
        ArrayList<Location> bmBoard2 = new ArrayList();
        BoardMarks b2 = new BoardMarks();
        Location loc2 = new Location(0, 3);
        for (Location l2 : b2.getNeighbors(loc2))
        {
            bmBoard2.add(l2);
        }
        assertEquals(3, bmBoard2.size());
        assertTrue(bmBoard2.contains(new Location(0, 2)));
        assertTrue(bmBoard2.contains(new Location(1, 2)));
        assertTrue(bmBoard2.contains(new Location(1, 3)));
    }
    
        @Test
    public void testTwoOne()
    {
        ArrayList<Location> bmBoard4 = new ArrayList();
        BoardMarks b4 = new BoardMarks();
        Location loc4 = new Location(2, 1);
        for (Location l4 : b4.getNeighbors(loc4))
        {
            bmBoard4.add(l4);
        }
        assertEquals(8, bmBoard4.size());
        assertTrue(bmBoard4.contains(new Location(3, 1)));
        assertTrue(bmBoard4.contains(new Location(3, 2)));
        assertTrue(bmBoard4.contains(new Location(3, 0)));
        assertTrue(bmBoard4.contains(new Location(2, 0)));
        assertTrue(bmBoard4.contains(new Location(2, 2)));
        assertTrue(bmBoard4.contains(new Location(1, 1)));
        assertTrue(bmBoard4.contains(new Location(1, 0)));
        assertTrue(bmBoard4.contains(new Location(1, 2)));
    }

    
    @Test
    public void TestLocationTwoTwo()
    { //3 that should be there and 3 that should not be there
        ArrayList<Location> bmBoard3 = new ArrayList();
        BoardMarks b3 = new BoardMarks();
        Location loc3 = new Location(2, 2);
        for (Location l3 : b3.getNeighbors(loc3))
        {
            bmBoard3.add(l3);
        }
        assertEquals(8, bmBoard3.size());
        assertTrue(bmBoard3.contains(new Location(1, 1)));
        assertTrue(bmBoard3.contains(new Location(1, 2)));
        assertTrue(bmBoard3.contains(new Location(1, 3)));
        assertTrue(bmBoard3.contains(new Location(2, 1)));
        assertTrue(bmBoard3.contains(new Location(2, 3)));
        assertTrue(bmBoard3.contains(new Location(3, 1)));
        assertTrue(bmBoard3.contains(new Location(3, 2)));
        assertTrue(bmBoard3.contains(new Location(3, 3)));
    }
    
        @Test
    public void testTwoThree()
    {
        ArrayList<Location> bmBoard4 = new ArrayList();
        BoardMarks b4 = new BoardMarks();
        Location loc4 = new Location(2, 3);
        for (Location l4 : b4.getNeighbors(loc4))
        {
            bmBoard4.add(l4);
        }
        assertEquals(5, bmBoard4.size());
        assertTrue(bmBoard4.contains(new Location(1, 2)));
        assertTrue(bmBoard4.contains(new Location(3, 2)));
        assertTrue(bmBoard4.contains(new Location(3, 3)));
        assertTrue(bmBoard4.contains(new Location(2, 2)));
        assertTrue(bmBoard4.contains(new Location(1, 3)));
    }

    @Test
    public void testThreeOne()
    {
        ArrayList<Location> bmBoard4 = new ArrayList();
        BoardMarks b4 = new BoardMarks();
        Location loc4 = new Location(3, 1);
        for (Location l4 : b4.getNeighbors(loc4))
        {
            bmBoard4.add(l4);
        }
        assertEquals(5, bmBoard4.size());
        assertTrue(bmBoard4.contains(new Location(3, 0)));
        assertTrue(bmBoard4.contains(new Location(3, 2)));
        assertTrue(bmBoard4.contains(new Location(2, 0)));
        assertTrue(bmBoard4.contains(new Location(2, 1)));
        assertTrue(bmBoard4.contains(new Location(2, 2)));
    }

    @Test
    public void TestLocationThreeThree()
    { //3 that should be there and 3 that should not be there
        ArrayList<Location> bmBoard3 = new ArrayList();
        BoardMarks b3 = new BoardMarks();
        Location loc3 = new Location(3, 3);
        for (Location l3 : b3.getNeighbors(loc3))
        {
            bmBoard3.add(l3);
        }
        assertEquals(3, bmBoard3.size());
        assertTrue(bmBoard3.contains(new Location(2, 2)));
        assertTrue(bmBoard3.contains(new Location(2, 3)));
        assertTrue(bmBoard3.contains(new Location(3, 2)));
    }
    
    @Test
    public void TestMarkLocationZeroZero()
    {
       ArrayList<Location> bmBoard3 = new ArrayList();
        BoardMarks b3 = new BoardMarks();
        Location loc3 = new Location(0, 0);
        Location locZ0 = new Location (0,1);
        b3.mark(locZ0);
        for (Location l3 : b3.getNeighbors(loc3))
        {
            bmBoard3.add(l3);
        } 
        
        assertEquals(2, bmBoard3.size());
        assertTrue(bmBoard3.contains(new Location(1,0)));
        assertTrue(bmBoard3.contains(new Location(1,1)));
    }
    
    @Test
    public void TestUnMarkLocationZeroZero()
    {
       ArrayList<Location> bmBoard3 = new ArrayList();
        BoardMarks b3 = new BoardMarks();
        Location loc3 = new Location(0, 0);
        Location locZ0 = new Location (0,1);
        b3.mark(locZ0);
        b3.unmark(locZ0);
        for (Location l3 : b3.getNeighbors(loc3))
        {
            bmBoard3.add(l3);
        } 
        
        assertEquals(3, bmBoard3.size());
        assertTrue(bmBoard3.contains(new Location(0,1)));
        assertTrue(bmBoard3.contains(new Location(1,0)));
        assertTrue(bmBoard3.contains(new Location(1,1)));
    }

}
