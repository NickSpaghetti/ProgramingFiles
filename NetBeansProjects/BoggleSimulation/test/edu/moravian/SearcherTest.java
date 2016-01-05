/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholascicchetti
 */
public class SearcherTest 
{
    @Test
    public void testNoWords() throws IOException, FileNotFoundException, BadFileFormatException
    {
        DiceManager dManager = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/SearcherDog");
        Lexicon l = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/LexiconWords");
        Board b = Board.makeFixedBoard(dManager);
        Searcher search = new Searcher(b, l);
        search.search();
        for(String s: search.getWords())
        {
            System.out.println(s);
        }
        assertEquals(0, search.getNumWords());
                
    }
    
    @Test
    public void testCat() throws IOException, FileNotFoundException, BadFileFormatException
    {
        DiceManager dManager = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/SearcherCAT");
        Lexicon l = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/LexiconWords");
        Board b = Board.makeFixedBoard(dManager);
        Searcher search = new Searcher(b, l);
        search.search();
        for(String s: search.getWords())
        {
            System.out.println(s);
        }
        assertEquals(1, search.getNumWords());
                
    }
}
 
