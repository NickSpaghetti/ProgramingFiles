package edu.moravian.coleman;

import edu.moravian.WordPath;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mebjc01
 */
public class WordPathTest
{

    @Test
    public void testEmptyPath()
    {
        // A new wordpath is empty, and calling pop should throw 
        // an exception.
        WordPath wp = new WordPath();

        assertEquals("", wp.getWord());

        try
        {
            wp.pop();
            fail("Should throw IllegalStateException");
        }
        catch(IllegalStateException e)
        {
            // good, this should happen
        }
    }

    @Test
    public void testPushPop()
    {
        // As letters are added and removed, they should maintain the
        // proper order.  This test exercises the WordPath instance
        // with interleved pushes and pops.
        WordPath wp = new WordPath();

        // Push 3 letters
        wp.push('c');
        assertEquals("c", wp.getWord());

        wp.push('a');
        assertEquals("ca", wp.getWord());

        wp.push('t');
        assertEquals("cat", wp.getWord());

        // Pop 2 of the letters
        wp.pop();
        assertEquals("ca", wp.getWord());

        wp.pop();
        assertEquals("c", wp.getWord());

        // Now add one more
        wp.push('c');
        assertEquals("cc", wp.getWord());
        
        // Remove all letters
        wp.pop();
        assertEquals("c", wp.getWord());

        wp.pop();
        assertEquals("", wp.getWord());

        // The path is empty, so another pop should cause an exception.
        try
        {
            wp.pop();
            fail("no exception");
        }
        catch(IllegalStateException e)
        {
            // good
        }
    }

    @Test
    public void testQstart()
    {
        // A word that starts with 'q' should be handled properly with
        // push and pop.  For example, the word "quit" would be added
        // via 3 pushes and removed with 3 pops.
        WordPath wp = new WordPath();

        wp.push('q');
        wp.push('i');
        wp.push('t');

        assertEquals("quit", wp.getWord());

        wp.pop();
        assertEquals("qui", wp.getWord());

        wp.pop();
        assertEquals("qu", wp.getWord());
        
        wp.pop();
        assertEquals("", wp.getWord());
    }

    @Test
    public void testQmiddle()
    {
        // A word that contains a 'q' in the moddle should be handled
        // properly with push and pop.
        WordPath wp = new WordPath();

        wp.push('a');
        wp.push('q');
        wp.push('b');

        assertEquals("aqub", wp.getWord());

        wp.pop();
        assertEquals("aqu", wp.getWord());

        wp.pop();
        assertEquals("a", wp.getWord());

        wp.pop();
        assertEquals("", wp.getWord());
    }

    @Test
    public void testQend()
    {
        // A word that contains 'q' at the end should be handled 
        // properly with push and pop.
        WordPath wp = new WordPath();

        wp.push('a');
        wp.push('b');
        wp.push('q');

        assertEquals("abqu", wp.getWord());

        wp.pop();
        assertEquals("ab", wp.getWord());

        wp.pop();
        assertEquals("a", wp.getWord());

        wp.pop();
        assertEquals("", wp.getWord());
    }

    @Test
    public void testMultipleQ()
    {
        // if the path contains multiple q's, they should each
        // be handled properly with push and pop.
        WordPath wp = new WordPath();

        wp.push('a');
        wp.push('q');
        wp.push('b');
        wp.push('q');
        wp.push('c');

        assertEquals("aqubquc", wp.getWord());

        wp.pop();
        assertEquals("aqubqu", wp.getWord());

        wp.pop();
        assertEquals("aqub", wp.getWord());

        wp.pop();
        assertEquals("aqu", wp.getWord());

        wp.pop();
        assertEquals("a", wp.getWord());

        wp.pop();
        assertEquals("", wp.getWord());
    }

    @Test
    public void testQsAndUs()
    {
        // If we push a 'q' and then push a 'u' (two dice), then
        // the path should be 'quu'
        WordPath wp = new WordPath();
        wp.push('u');
        wp.push('q');
        wp.push('u');

        assertEquals("uquu", wp.getWord());

        wp.pop();
        assertEquals("uqu", wp.getWord());

        wp.pop();
        assertEquals("u", wp.getWord());

        wp.pop();
        assertEquals("", wp.getWord());
    }
}