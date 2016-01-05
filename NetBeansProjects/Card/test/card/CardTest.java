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
public class CardTest 
{
    Card testCard = new Card(1,1,1,1);
    Card testCardFour = new Card(4,4,4,4);
    Card testCardZero = new Card(0,0,0,0);
    Card testCardNegtive = new Card(-1,-1,-1,-1);
    Card testCardIsSet = new Card(2,2,2,2);
    Card testCardIsSetThree = new Card (3,3,3,3);
    @Test
    public void testQuantity()
    {
        
        assertEquals(1, testCard.getQuantity());
    }
    
    @Test
    public void testColor()
    {
        assertEquals(1, testCard.getColor());
    }
    
    @Test 
    public void testShape()
    {
        assertEquals(1,testCard.getShape());
    }
    
    @Test
   public void testShading()
    {
        assertEquals(1,testCard.getShading());
    }
    
    @Test
    public void testQuantityGreaterThenThree()
    {
        
      assertEquals(1, testCardFour.getQuantity());
    }
    
    @Test
    public void testColorGreaterThenThree()
    {
        assertEquals(1, testCardFour.getQuantity());
    }
    
    @Test
    public void testShapeGreaterThenThree()
    {
        assertEquals(1, testCardFour.getShape());
    }
    
    @Test
    public void testShadingGreaterThenThree()
    {
        assertEquals(1, testCardFour.getShading());
    }
    @Test
    public void testEverythingLowerThenZero()
    {
        assertEquals(3,testCardZero.getQuantity());
        assertEquals(3,testCardZero.getColor());
        assertEquals(3,testCardZero.getShape());
        assertEquals(3,testCardZero.getShading());
    }
    
   @Test
    public void testEverythingLowerThenNegtive()
    {
        assertEquals(2,testCardNegtive.getQuantity());
        assertEquals(2,testCardNegtive.getColor());
        assertEquals(2,testCardNegtive.getShape());
        assertEquals(2,testCardNegtive.getShading());
    }
   @Test
   public void isSet()
   {
       assertTrue(testCardIsSet.isSet(testCard,testCardIsSetThree));
   }
   @Test
   public void isNotSet()
   {
       Card isNotSet = new Card(1,2,2,2);
       Card isNotSetTwo = new Card(2,3,3,3);
       Card isNotSetThree = new Card(3,1,2,1);
       
       assertFalse(isNotSet.isSet(isNotSetTwo, isNotSetThree));
       
   }
   
   @Test 
   public void toStringTest()
   {
       Card isToString = new Card(1,1,1,1);
       Card isToStringTwo = new Card(2,2,2,2);
       Card isToStringThree = new Card(3,3,3,3);
       assertEquals("1ROO",isToString.toString());
       assertEquals("2GTD",isToStringTwo.toString());
       assertEquals("3PSS",isToStringThree.toString());
   }
   
}