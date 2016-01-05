/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package card;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholascicchetti
 */
public class GameTest
{
    Game g = new Game();
    Deck d = new Deck();
    Card c = new Card(1,1,1,1);
    Table t = new Table();
    
    
    public GameTest()
    {
        
        
    }
    
    
    @Test
    public void testZeroParameterConstructor()
    {
     
    }

    @Test
    public void testGameFileReader()
    {
       g.Game(("src/card/deck.dat"));
    }
    
    /*@Test 
    public int testNumSets()
    {
        return 0;
    }
    
    @Test
    public int testNumCards()
    {
        return 0;
    }
    */
    
    
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }

    
}
