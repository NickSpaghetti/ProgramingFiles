/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholascicchetti
 */
public class DiceManagerTest
{
    
    @Test
    public void testGoodFileAllA() throws IOException, IndexOutOfBoundsException, BadFileFormatException
    {
        DiceManager createManager = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/DiceManagerAllA");
        assertEquals('a',createManager.getDie(0).getValue());

    }   
    @Test
    public void testGoodFileAtoP() throws IOException, IndexOutOfBoundsException, BadFileFormatException
    {
        DiceManager createManager = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/DiceManagerGoodFileAtoP");
        assertEquals('a',createManager.getDie(0).getValue());
        assertEquals('b',createManager.getDie(1).getValue());
        assertEquals('c',createManager.getDie(2).getValue());
        assertEquals('d',createManager.getDie(3).getValue());
        assertEquals('e',createManager.getDie(4).getValue());
        assertEquals('f',createManager.getDie(5).getValue());
        assertEquals('g',createManager.getDie(6).getValue());
        assertEquals('h',createManager.getDie(7).getValue());
        assertEquals('i',createManager.getDie(8).getValue());
        assertEquals('j',createManager.getDie(9).getValue());
        assertEquals('k',createManager.getDie(10).getValue());
        assertEquals('l',createManager.getDie(11).getValue());
        assertEquals('m',createManager.getDie(12).getValue());
        assertEquals('n',createManager.getDie(13).getValue());
        assertEquals('o',createManager.getDie(14).getValue());
        assertEquals('p',createManager.getDie(15).getValue());
    }
    
    @Test
    public void testGoodFileWithComments() throws IOException, IndexOutOfBoundsException, BadFileFormatException
    {
        DiceManager createManager = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/DiceManagerWithComments");
        assertEquals('a',createManager.getDie(0).getValue());

    }
    
    @Test
    public void testGoodFileWithAllQu() throws IOException, IndexOutOfBoundsException, BadFileFormatException
    {
        DiceManager createManager = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/DiceManagerAllQu");
        assertEquals('q',createManager.getDie(0).getValue());

    }
    
    @Test(expected = BadFileFormatException.class)
    public void testDiceManagerBEFfile() throws IOException, IndexOutOfBoundsException, BadFileFormatException
    {
        DiceManager createManager = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/DiceManagerBFE");
        assertEquals('q',createManager.getDie(0).getValue());

    }
    
    

}
