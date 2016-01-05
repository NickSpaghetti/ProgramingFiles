package edu.moravian.coleman;

import edu.moravian.Lexicon;
import java.io.FileNotFoundException;
import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mebjc01
 */
public class LexiconTest
{

    @Test
    public void testWordsFile() throws FileNotFoundException, IOException
    {
        Lexicon l = new Lexicon("test/colemanfiles/words.txt");

        assertTrue(l.isWord("hello"));
        assertTrue(l.isPrefix("anti"));

        assertFalse(l.isWord("xyz"));
        assertFalse(l.isPrefix("qqqzzz"));
    }
    
    @Test
    public void testPrefix() throws FileNotFoundException, IOException
    {
        Lexicon l = new Lexicon("test/colemanfiles/words.txt");
        
        assertTrue(l.isPrefix("h"));
        assertTrue(l.isPrefix("he"));
        assertTrue(l.isPrefix("hel"));
        assertTrue(l.isPrefix("hell"));
        assertTrue(l.isPrefix("hello"));
    }


}