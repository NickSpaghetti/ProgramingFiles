package edu.moravian;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mebjc01
 */
public class SampleTest
{

    @Test
    public void testThatEverythingWorksByCallingEverythingInASingleMethodThisIsNotAGoodTestMuchLessAGoodTestNamePleaseDoNotEmmulate() throws Exception
    {
        Grid g = new Grid();
        g = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/values.dat");
        
        g.clearValue(1, 0);
        
        assertEquals(0, g.getValue(1, 0));

        for(int col = 0; col < 9; col++)
        {
            assertEquals(9 - col, g.getValue(2, col));
        }
        
        assertTrue(g.isLegalSet(1, 0, 1));
        
        g.setValue(1, 0, 1);

        String filename = "dontworryitwontbetherelong.dat";
        try
        {
            g.save(filename);
        }
        finally
        {
            Files.delete(FileSystems.getDefault().getPath(filename));
        }
    }
}
