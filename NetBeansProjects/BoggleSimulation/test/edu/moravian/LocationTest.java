/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholascicchetti
 */
public class LocationTest
{
    @Test
    public void validLocationTest()
    {
        Location l = new Location(0,2);
        assertEquals(02,l.getRow(),l.getCol());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void invalidLocationRowTestLessThanZero()
    {
        Location failRow = new Location(-1,2);
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void invalidLocationRowTestGreaterThanThree()
    {
        Location failRowTest = new Location(4,2);
        
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void invalidLocationColTestLessThanZero()
    {
        Location failCol = new Location(0,-5);
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void invalidLocationColTestGreaterThanThree()
    {
        Location failColTest = new Location(3,10);
        
        
    }
    
    
}
