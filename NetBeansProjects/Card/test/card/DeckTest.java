/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
/**
 *
 * @author nicholascicchetti
 */
public class DeckTest extends TestCase 
{
    
  public void testDeckFromFile()
  {
    // This file contains 3 cards.
    Deck d = new Deck("src/card/deck.dat");
    
    assertTrue(d.hasNext());
    assertEquals(new Card(1, 1, 1, 1), d.getNext());
    
    assertTrue(d.hasNext());
    assertEquals(new Card(1, 1, 1, 2), d.getNext());
    
    assertTrue(d.hasNext());
    assertEquals(new Card(1, 1, 1, 3), d.getNext());
    
    assertFalse(d.hasNext());
  }
    
    public DeckTest() 
    {
        
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        
    }
}