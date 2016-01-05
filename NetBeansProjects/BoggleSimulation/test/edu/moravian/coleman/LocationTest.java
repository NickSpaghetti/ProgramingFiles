/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian.coleman;

import edu.moravian.Location;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mebjc01
 */
public class LocationTest
{

    @Test
    public void testLocation()
    {
        Location l = new Location(0, 0);
        
        assertEquals(0, l.getRow());
        assertEquals(0, l.getCol());
        
    }
    
    @Test
    public void testBadRow()
    {
        try
        {
            Location l = new Location(-5, 3);
            fail("Should throw an IllegalArgumentException");
        }
        catch(IllegalArgumentException e)
        {
            // good
        }
    }

    @Test
    public void testBadCol()
    {
        try
        {
            Location l = new Location(2, -5);
            fail("Should throw an IllegalArgumentException");
        }
        catch(IllegalArgumentException e)
        {
            // good
        }
    }
}
