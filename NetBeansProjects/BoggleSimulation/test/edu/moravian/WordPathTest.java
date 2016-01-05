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
public class WordPathTest
{
    @Test
    public void WordPathTest()
    {
        WordPath emptyWord = new WordPath();
        
    }
    
    @Test
    public void puttingOnOneLetter()
    {
        WordPath addLetter = new WordPath();
        addLetter.push('n');
        assertEquals("n",addLetter.getWord());
         
    }
    @Test(expected = IllegalStateException.class)
    public void testIllegalStateExceptionOnWordBigerThan16()
    {
        WordPath BigWord = new WordPath();

        BigWord.push('t');
        BigWord.push('h');
        BigWord.push('i');
        BigWord.push('s');
        BigWord.push('_');
        BigWord.push('t');
        BigWord.push('e');
        BigWord.push('s');
        BigWord.push('t');
        BigWord.push('_');
        BigWord.push('i');
        BigWord.push('s');
        BigWord.push('_');
        BigWord.push('g');
        BigWord.push('o');
        BigWord.push('i');
        BigWord.push('n');
        BigWord.push('g');
        BigWord.push('_');
        BigWord.push('t');
        BigWord.push('o');
        BigWord.push('_');
        BigWord.push('f');
        BigWord.push('a');
        BigWord.push('i');
        BigWord.push('l');
    }
    
    @Test(expected = IllegalStateException.class)
    public void testIllegalStateExceptionOnPopWithNoWords()
    {
      WordPath noWords = new WordPath();
      noWords.pop();
      
    }
    
    @Test
    public void testPushingOnQuAsFirstLetters()
    {
        WordPath testPushQu = new WordPath();
        testPushQu.push('q');
        assertEquals("qu",testPushQu.getWord());
    }
    @Test
    public void testPopingOffQuWithOneLetterLeft()
    {
        WordPath testPopQu = new WordPath();
        testPopQu.push('a');
        testPopQu.push('q');
        testPopQu.push('u');
        testPopQu.pop();
        testPopQu.pop();
        assertEquals("a",testPopQu.getWord());
    }
    
    @Test(expected = IllegalStateException.class)
    public void testPushingQuAsLetterGreaterThanLength14()
    {
        WordPath testPopQu = new WordPath();
        testPopQu.push('a');
        testPopQu.push('a');
        testPopQu.push('b');
        testPopQu.push('c');
        testPopQu.push('d');
        testPopQu.push('e');
        testPopQu.push('f');
        testPopQu.push('g');
        testPopQu.push('h');
        testPopQu.push('i');
        testPopQu.push('j');
        testPopQu.push('k');
        testPopQu.push('l');
        testPopQu.push('m');
        testPopQu.push('n');
        testPopQu.push('o');
        testPopQu.push('p');
        testPopQu.push('q');
        testPopQu.push('u');
        
    }
    @Test
    public void testForWordWithQuInTheBegining()
    {
        WordPath newWord = new WordPath();
        newWord.push('q');
        newWord.push('e');
        newWord.push('s');
        newWord.push('t');
        newWord.push('i');
        newWord.push('o');
        newWord.push('n');
        assertEquals("question",newWord.getWord());
    }
    
    @Test 
    public void pushWordpopLastThreeLettersOfftoMakeANewWord()
    {
        WordPath smallWord = new WordPath();
        smallWord.push('s');
        smallWord.push('m');
        smallWord.push('a');
        smallWord.push('l');
        smallWord.push('l');
        smallWord.pop();
        smallWord.pop();
        smallWord.pop();
        smallWord.push('o');
        smallWord.push('o');
        smallWord.push('t');
        smallWord.push('h');
        assertEquals("smooth",smallWord.getWord());
        
    }
}
