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
public class DieTest
{
    @Test
    public void DieConstructorTest()
    {
        Die newDie = new Die('a','a','a','a','a','a');
        assertEquals('a',newDie.getValue());
        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testNumberValues()
    {
       Die wrongDie = new Die('1','b','c','d','e','f');
       assertEquals('1',wrongDie.getValue());  
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSymbolsValues()
    {
       Die wrong2Die = new Die('%','b','c','d','e','f');
       assertEquals('%',wrong2Die.getValue());  
    }
    
    @Test
    public void testShuffleAccurcy()
    {   
        int index;
        int[] dieAccuracy = new int [6];
        Die accuracyDie = new Die('a','b','c','d','e','f');
        for(int i = 0; i < 1000; i++)
        {
            accuracyDie.roll();
            index = accuracyDie.getValue()-'a';
            dieAccuracy[index]+=1;
        }
        assertEquals(.1666,dieAccuracy[0]/1000.0,.1);
    }

}
