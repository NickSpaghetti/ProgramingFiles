package edu.moravian.coleman;

import edu.moravian.BadFileFormatException;
import edu.moravian.DiceManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mebjc01
 */
public class DiceManagerTest
{

    private static String path = "test/colemanfiles/";
    
    @Test
    public void testValidFile()
    {
        try
        {
            DiceManager d = new DiceManager(path + "goodFile.dat");

            // Each of the dice has the same value on each face,
            // sequentially ordered.
            assertEquals('a', d.getDie(0).getValue());
            assertEquals('b', d.getDie(1).getValue());
            assertEquals('c', d.getDie(2).getValue());
            assertEquals('d', d.getDie(3).getValue());
            assertEquals('e', d.getDie(4).getValue());
            assertEquals('f', d.getDie(5).getValue());
            assertEquals('g', d.getDie(6).getValue());
            assertEquals('h', d.getDie(7).getValue());
            assertEquals('i', d.getDie(8).getValue());
            assertEquals('j', d.getDie(9).getValue());
            assertEquals('k', d.getDie(10).getValue());
            assertEquals('l', d.getDie(11).getValue());
            assertEquals('m', d.getDie(12).getValue());
            assertEquals('n', d.getDie(13).getValue());
            assertEquals('o', d.getDie(14).getValue());
            // out of sequence to test the 'q'
            assertEquals('q', d.getDie(15).getValue());
        }
        catch (FileNotFoundException ex)
        {
            fail("FileNotFoundException throw");
        }
        catch (IOException ex)
        {
            fail("IOException thrown");
        }
        catch (BadFileFormatException ex)
        {
            fail("BadFileFormatException thrown");
        }
    }

    @Test
    public void testFileNotFound()
    {
        try
        {
            DiceManager d = new DiceManager("itDontExistYo.dat");
            fail("FileNotFoundException not thrown");
        }
        catch (FileNotFoundException ex)
        {
            // good
        }
        catch (IOException ex)
        {
            fail("IO Exception thrown");
        }
        catch (BadFileFormatException ex)
        {
            fail("BadFileFormatException thrown");
        }
    }

    @Test
    public void testBadLineCount()
    {
        try
        {
            // This file has too many element on one of the lines
            DiceManager d = new DiceManager(path + "badLineCount.dat");
            fail("BadFileFormatException not thrown");
        }
        catch (FileNotFoundException ex)
        {
            fail("FileNotFoundException thrown");
        }
        catch (IOException ex)
        {
            fail("IOException thrown");
        }
        catch (BadFileFormatException ex)
        {
            // good
        }
    }

    @Test
    public void testBadLineLetters()
    {
        try
        {
            // This file has an element that is too big
            DiceManager d = new DiceManager(path + "badLineLetters.dat");
            fail("BadFileFormatException not thrown");
        }
        catch (FileNotFoundException ex)
        {
            fail("FileNotFoundException thrown");
        }
        catch (IOException ex)
        {
            fail("IOException thrown");
        }
        catch (BadFileFormatException ex)
        {
            // good
        }
    }

    @Test
    public void testBadLineCharacters()
    {
        try
        {
            // This file has an element that is not a letter
            DiceManager d = new DiceManager(path + "badLineCharacters.dat");
            fail("BadFileFormatException not thrown");
        }
        catch (FileNotFoundException ex)
        {
            fail("FileNotFoundException thrown");
        }
        catch (IOException ex)
        {
            fail("IOException thrown");
        }
        catch (BadFileFormatException ex)
        {
            // good
        }
    }

    @Test
    public void testTooFewLines()
    {
        try
        {
            // This file only has 10 lines
            DiceManager d = new DiceManager(path + "tooFewLines.dat");
            fail("BadFileFormatException not thrown");
        }
        catch (FileNotFoundException ex)
        {
            fail("FileNotFoundException thrown");
        }
        catch (IOException ex)
        {
            fail("IOException thrown");
        }
        catch (BadFileFormatException ex)
        {
            // good
        }
    }

    @Test
    public void testTooManyLines()
    {
        try
        {
            // This file has 17 lines
            DiceManager d = new DiceManager(path + "tooManyLines.dat");
            fail("BadFileFormatException not thrown");
        }
        catch (FileNotFoundException ex)
        {
            fail("FileNotFoundException thrown");
        }
        catch (IOException ex)
        {
            fail("IOException thrown");
        }
        catch (BadFileFormatException ex)
        {
            // good
        }
    }
}