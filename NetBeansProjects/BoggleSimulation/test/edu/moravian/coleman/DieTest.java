package edu.moravian.coleman;

import edu.moravian.Die;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mebjc01
 */
public class DieTest
{

    @Test
    public void testSixSameDie()
    {
        Die d = new Die('a', 'a', 'a', 'a', 'a', 'a');

        for(int i = 0; i < 1000; i++)
        {
            d.roll();
            assertEquals('a', d.getValue());
        }
    }

    @Test
    public void testSixDifferent()
    {
        Die d = new Die('a', 'b', 'c', 'd', 'e', 'f');

        int[] counts = new int[6];

        for(int i = 0; i < 10000; i++)
        {
            d.roll();
            counts[(int) (d.getValue() - 'a')]++;
        }

        // Ok, we all know that in theory any test that depends on
        // randomness is questionable.  But come on!  Do you really
        // believe that after 10000 rolls, the frequencies of each
        // side are going to be more than a ten percent from the theoretical
        // probability?
        for(int i = 0; i < 5; i++)
        {
            assertEquals(1.0 / 6.0, counts[i] / 10000.0, 0.1);
        }
    }

    @Test
    public void testBadDie()
    {
        try
        {
            new Die('1', 'a', 'a', 'a', 'a', 'a');
            fail("IllegalARgumentException not thrown");
        }
        catch(IllegalArgumentException e)
        {
            // good
        }

        try
        {
            new Die('a', '1', 'a', 'a', 'a', 'a');
            fail("IllegalARgumentException not thrown");
        }
        catch(IllegalArgumentException e)
        {
            // good
        }

        try
        {
            new Die('a', 'a', '1', 'a', 'a', 'a');
            fail("IllegalARgumentException not thrown");
        }
        catch(IllegalArgumentException e)
        {
            // good
        }

        try
        {
            new Die('a', 'a', 'a', '1', 'a', 'a');
            fail("IllegalARgumentException not thrown");
        }
        catch(IllegalArgumentException e)
        {
            // good
        }

        try
        {
            new Die('a', 'a', 'a', 'a', '1', 'a');
            fail("IllegalARgumentException not thrown");
        }
        catch(IllegalArgumentException e)
        {
            // good
        }

        try
        {
            new Die('a', 'a', 'a', 'a', 'a', '1');
            fail("IllegalARgumentException not thrown");
        }
        catch(IllegalArgumentException e)
        {
            // good
        }
    }
}