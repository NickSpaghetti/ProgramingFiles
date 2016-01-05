/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.moravian;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author nicholascicchetti
 */
public class BoardTest {
    
     @Test
    public void BoardTestFixedBoard() throws IOException, FileNotFoundException, 
            BadFileFormatException {
        
        DiceManager dm = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/BoardAllLettersOnBoard");
        Board b = Board.makeFixedBoard(dm);
        assertEquals('A', b.getValue(new Location(0,0)));
        assertEquals('B', b.getValue(new Location(0,1)));
        assertEquals('C', b.getValue(new Location(0,2)));
        assertEquals('D', b.getValue(new Location(0,3)));
        assertEquals('E', b.getValue(new Location(1,0)));
        assertEquals('F', b.getValue(new Location(1,1)));
        assertEquals('G', b.getValue(new Location(1,2)));
        assertEquals('H', b.getValue(new Location(1,3)));
        assertEquals('I', b.getValue(new Location(2,0)));
        assertEquals('J', b.getValue(new Location(2,1)));
        assertEquals('K', b.getValue(new Location(2,2)));
        assertEquals('L', b.getValue(new Location(2,3)));
        assertEquals('M', b.getValue(new Location(3,0)));
        assertEquals('N', b.getValue(new Location(3,1)));
        assertEquals('O', b.getValue(new Location(3,2)));
        assertEquals('P', b.getValue(new Location(3,3)));
        
        assertEquals("ABCD\nEFGH\nIJKL\nMNOP", b.toString());
    }
    
    @Test
    public void TestRandomBoard() throws IOException, FileNotFoundException, 
            BadFileFormatException{
        
        DiceManager dm = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/BoardAllLettersOnBoard");
        Board b = Board.makeRandomBoard(dm);
        
        ArrayList<Character> l = new ArrayList();
        
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
                l.add(b.getValue(new Location(row, col)));
            }
        }
        assertTrue(l.contains('A'));
        assertTrue(l.contains('B'));
        assertTrue(l.contains('C'));
        assertTrue(l.contains('D'));
        assertTrue(l.contains('E'));
        assertTrue(l.contains('F'));
        assertTrue(l.contains('G'));
        assertTrue(l.contains('H'));
        assertTrue(l.contains('I'));
        assertTrue(l.contains('J'));
        assertTrue(l.contains('K'));
        assertTrue(l.contains('L'));
        assertTrue(l.contains('M'));
        assertTrue(l.contains('N'));
        assertTrue(l.contains('O'));
        assertTrue(l.contains('P'));
    } 
    
    @Test
    public void testRandomBoardManyCreations()throws IOException, FileNotFoundException, 
            BadFileFormatException{
        
        DiceManager dm = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/BoardAllLettersOnBoard");
        
        int[] tArray = new int[16];
        double numTimes = 10000.0;

        
        for(int i = 0; i < numTimes; i++){
            
            Board b = Board.makeRandomBoard(dm);
            tArray[b.getValue(new Location(0,0))-'A']++;
            
            
        }
        
        assertEquals(.0625, (tArray[0]/numTimes), .1);
        assertEquals(.0625, (tArray[1]/numTimes), .1);
        assertEquals(.0625, (tArray[2]/numTimes), .1);
        assertEquals(.0625, (tArray[3]/numTimes), .1);
        assertEquals(.0625, (tArray[4]/numTimes), .1);
        assertEquals(.0625, (tArray[5]/numTimes), .1);
        assertEquals(.0625, (tArray[6]/numTimes), .1);
        assertEquals(.0625, (tArray[7]/numTimes), .1);
        assertEquals(.0625, (tArray[8]/numTimes), .1);
        assertEquals(.0625, (tArray[9]/numTimes), .1);
        assertEquals(.0625, (tArray[10]/numTimes), .1);
        assertEquals(.0625, (tArray[11]/numTimes), .1);
        assertEquals(.0625, (tArray[12]/numTimes), .1);
        assertEquals(.0625, (tArray[13]/numTimes), .1);
        assertEquals(.0625, (tArray[14]/numTimes), .1);
        assertEquals(.0625, (tArray[15]/numTimes), .1);
    }
}