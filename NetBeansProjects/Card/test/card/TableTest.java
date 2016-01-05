/*
 * To change this template, choose Tools | Templates
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
public class TableTest 
{
 Table t = new Table();   
 Card c = new Card(1,1,1,1); 
 Card c2 = new Card(2,2,2,2);
 Card c3 = new Card (3,3,3,3);
 
 @Test
 public void testNoCardsInTable()
 {
    assertEquals(0,t.numCards());
 }
 
 @Test
 public void testOnTable()
 {
     t.add(c2);
     assertEquals(true,t.onTable(c2));
 }

 @Test
 public void testRemoveSet()
 {
    t.add(c);
     t.add(c2);
     t.add(c3);
     assertEquals(3,t.numCards());
     assertEquals(1,t.numSets());
     t.removeSet(c, c2, c3);
     assertEquals(0,t.numCards());
     assertEquals(0,t.numSets()); 
     
 }
 
 private Table makeTable(String filename)
 {
     Deck d = new Deck(filename);
     Table tz = new Table();
     while(d.hasNext())
     {
         tz.add(d.getNext());
         
     }
     return tz;
 }
 
 @Test
 public void testNoSetinTwelve()
 {
    Table tb = makeTable("12cards0sets.dat");
    assertEquals(12,tb.numCards());
    assertEquals(0,tb.numSets());
 }
 
 @Test
 public void testIsSet()
 {
     Table tbl = makeTable("deck.dat");
     assertEquals(1,tbl.numSets());
 }
}

