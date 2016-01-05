/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.moravian;

import java.io.FileNotFoundException;
import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author nicholascicchetti
 */
public class LexiconTest {
    

    
    @Test (expected = FileNotFoundException.class)
    public void testLexiconTestFileNotFoundException() throws IOException, BadFileFormatException, FileNotFoundException{
       
            Lexicon lexi = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/theFilIseNotThere.dat");

    }  
    @Test (expected = BadFileFormatException.class)
    public void testTooManyWords() throws IOException, FileNotFoundException, BadFileFormatException
    {
        Lexicon lexi = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/LexicionTooBig");
    }
    @Test//
    public void testCapitalLetters() throws IOException, FileNotFoundException, BadFileFormatException{
        Lexicon finderLexicon = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/LexiconWords");
        assertTrue(finderLexicon.isPrefix("KINGDOM"));
        assertTrue(finderLexicon.isWord("KINGDOM"));
        //assertEquals()
    }
    @Test
    public void testForWordsThatAreLowerCase() throws IOException, FileNotFoundException, BadFileFormatException
    {
        Lexicon lex = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/LexiconWords");
        assertFalse(lex.isPrefix("kingdom"));
        assertTrue(lex.isWord("kingdoms"));
    }
    
    @Test
    public void testForPrefix() throws IOException, FileNotFoundException, BadFileFormatException
    {
        Lexicon lex = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/LexiconWords");
        assertTrue(lex.isPrefix("DOG"));
        
    }
    
    @Test
    public void testForWord() throws IOException, FileNotFoundException, BadFileFormatException
    {
        Lexicon lex = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/LexiconWords");
        assertTrue(lex.isWord("APPLE"));
        
    }
}
