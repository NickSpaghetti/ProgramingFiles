package edu.moravian.coleman;




import edu.moravian.BadFileFormatException;
import edu.moravian.Board;
import edu.moravian.DiceManager;
import edu.moravian.Lexicon;
import edu.moravian.Searcher;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mebjc01
 */
public class SearcherTest
{
    private static String path = "test/colemanfiles/";
    private static String datapath = "test/colemanfiles/";

    @Test
    public void testSingleWord() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "fixed.dat"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));

        s.search();

        for(String word : s.getWords())
        {
            assertEquals("why", word);
        }

        assertEquals(1, s.getNumWords());
    }

    @Test
    public void testNoWords() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "nowords.dat"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));

        s.search();

        assertFalse(s.getWords().iterator().hasNext());
        assertEquals(0, s.getNumWords());
    }
    
    @Test
    public void testCrossPath() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "crosspath.txt"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));
        
        s.search();
        
        for(String word : s.getWords())
        {
            assertEquals("blue", word);
        }

        assertEquals(1, s.getNumWords());
    }

    @Test
    public void testPrefix() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "prefix.txt"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));
        
        s.search();
        
        ArrayList<String> words = new ArrayList<String>();
        
        for(String word : s.getWords())
        {
            words.add(word);
        }

        assertEquals(2, words.size());
        assertEquals(2, s.getNumWords());
        assertTrue(words.contains("acid"));
        assertTrue(words.contains("acidic"));
    }

    @Test
    public void testNoDup() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "nodup.txt"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));
        
        s.search();
        
        assertFalse(s.getWords().iterator().hasNext());
        assertEquals(0, s.getNumWords());
    }

    @Test
    public void testNoTwoLetterWords() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "notwo.txt"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));
        
        s.search();
        
        assertFalse(s.getWords().iterator().hasNext());
        assertEquals(0, s.getNumWords());
    }
    
    @Test
    public void testCountWordsOnce() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "nodupword.txt"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));
        
        s.search();
        
        ArrayList<String> words = new ArrayList<String>();
        
        for(String word : s.getWords())
        {
            words.add(word);
        }

        assertEquals(1, words.size());
        assertEquals(1, s.getNumWords());
        assertTrue(words.contains("mom"));
    }
    
    
    
    @Test
    public void testDoubleSearch() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "nowords.dat"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));

        s.search();

        try
        {
            s.search();
            fail("double search should throw IllegalArgumentException");
        }
        catch(IllegalStateException e)
        {
            // good
        }
    }
    
    @Test
    public void testgetWordsBeforeSearch() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "nowords.dat"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));

        try
        {
            s.getWords();
            fail("Should throw exception");
        }
        catch(IllegalStateException e)
        {
            // ok
        }
    }
    
    @Test
    public void testgetNumWordsBeforeSearch() throws FileNotFoundException, IOException, BadFileFormatException
    {
        Board b = Board.makeFixedBoard(new DiceManager(path + "nowords.dat"));
        Searcher s = new Searcher(b, new Lexicon(datapath + "words.txt"));

        try
        {
            s.getNumWords();
            fail("Should throw exception");
        }
        catch(IllegalStateException e)
        {
            // ok
        }
        
    }
}