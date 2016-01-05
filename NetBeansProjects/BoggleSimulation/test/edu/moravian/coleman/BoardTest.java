package edu.moravian.coleman;

import edu.moravian.BadFileFormatException;
import edu.moravian.Board;
import edu.moravian.DiceManager;
import edu.moravian.Location;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mebjc01
 */
public class BoardTest
{
    private static String path = "test/colemanfiles/";

    @Test
    public void testGoodBoardRandom()
    {
        
        try
        {
            // This file contains 16 dice, each with the same value
            // on each face (this ensures the rolls will have known values).
            // The first die contains all 'a,' the second all 'b,' etc.
            // through all 'o.'  The last die contains all 'qu' to test
            // handling of the only legal pair.
            DiceManager dice = new DiceManager(path + "goodFile.dat");

            Board board = Board.makeRandomBoard(dice);
            
            // Since the dice are shuffled, we have to be a little more
            // careful about dealing with the values.  We will collect
            // all of them and then sort them.
            ArrayList<Character> chars = new ArrayList<Character>(16);

            for(int row = 0; row < 4; row++)
            {
                for(int col = 0; col < 4; col++)
                {
                    chars.add(board.getValue(new Location(row, col)));
                }
            }

            Collections.sort(chars);

            assertEquals('a', chars.get(0).charValue());
            assertEquals('b', chars.get(1).charValue());
            assertEquals('c', chars.get(2).charValue());
            assertEquals('d', chars.get(3).charValue());
            assertEquals('e', chars.get(4).charValue());
            assertEquals('f', chars.get(5).charValue());
            assertEquals('g', chars.get(6).charValue());
            assertEquals('h', chars.get(7).charValue());
            assertEquals('i', chars.get(8).charValue());
            assertEquals('j', chars.get(9).charValue());
            assertEquals('k', chars.get(10).charValue());
            assertEquals('l', chars.get(11).charValue());
            assertEquals('m', chars.get(12).charValue());
            assertEquals('n', chars.get(13).charValue());
            assertEquals('o', chars.get(14).charValue());
            // out of sequence to test the 'q'
            assertEquals('q', chars.get(15).charValue());
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
            fail("BadFileFormatException thrown");
        }
    }

   @Test
    public void testGoodBoardFixed()
    {
        try
        {
            // This file contains 16 dice, each with the same value
            // on each face (this ensures the rolls will have known values).
            // The first die contains all 'a,' the second all 'b,' etc.
            // through all 'o.'  The last die contains all 'qu' to test
            // handling of the only legal pair.
            DiceManager dice = new DiceManager(path + "goodFile.dat");

            Board board = Board.makeFixedBoard(dice);

            // The dice are not shuffled, so we can just check each

            assertEquals('a', board.getValue(new Location(0, 0)));
            assertEquals('b', board.getValue(new Location(0, 1)));
            assertEquals('c', board.getValue(new Location(0, 2)));
            assertEquals('d', board.getValue(new Location(0, 3)));
            assertEquals('e', board.getValue(new Location(1, 0)));
            assertEquals('f', board.getValue(new Location(1, 1)));
            assertEquals('g', board.getValue(new Location(1, 2)));
            assertEquals('h', board.getValue(new Location(1, 3)));
            assertEquals('i', board.getValue(new Location(2, 0)));
            assertEquals('j', board.getValue(new Location(2, 1)));
            assertEquals('k', board.getValue(new Location(2, 2)));
            assertEquals('l', board.getValue(new Location(2, 3)));
            assertEquals('m', board.getValue(new Location(3, 0)));
            assertEquals('n', board.getValue(new Location(3, 1)));
            assertEquals('o', board.getValue(new Location(3, 2)));
            // out of sequence to test the 'q'
            assertEquals('q', board.getValue(new Location(3, 3)));
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
            fail("BadFileFormatException thrown");
        }
    }
   
}