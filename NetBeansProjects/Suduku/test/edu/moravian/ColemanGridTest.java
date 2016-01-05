package edu.moravian;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mebjc01
 */
public class ColemanGridTest
{

    @Test
    public void testNewEmptyGrid()
    {
        Grid g = new Grid();

        for (int row = 0; row < 9; row++)
        {
            for (int col = 0; col < 9; col++)
            {
                assertEquals(0, g.getValue(row, col));
            }
        }
    }

    private int[][] makeComplete()
    {
        int values[][] =
        {
            {
                5, 1, 9, 3, 7, 2, 6, 8, 4
            },
            {
                2, 6, 3, 4, 5, 8, 9, 1, 7
            },
            {
                4, 7, 8, 9, 6, 1, 2, 3, 5
            },
            {
                6, 9, 4, 1, 3, 7, 8, 5, 2
            },
            {
                1, 8, 7, 2, 4, 5, 3, 6, 9
            },
            {
                3, 2, 5, 8, 9, 6, 7, 4, 1
            },
            {
                7, 5, 2, 6, 8, 4, 1, 9, 3
            },
            {
                8, 3, 1, 5, 2, 9, 4, 7, 6
            },
            {
                9, 4, 6, 7, 1, 3, 5, 2, 8
            }
        };

        return values;
    }

    @Test
    public void testNewLoadComplete() throws FileNotFoundException, FileFormatException, IOException
    {
        int values[][] = makeComplete();

        Grid g = new Grid("test/colemanTestFiles/complete.dat");

        for (int col = 0; col < 9; col++)
        {
            for (int row = 0; row < 9; row++)
            {
                assertEquals(values[row][col], g.getValue(row, col));
            }
        }
    }

    @Test
    public void testNewLoadEmpty() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/empty.dat");

        for (int col = 0; col < 9; col++)
        {
            for (int row = 0; row < 9; row++)
            {
                assertEquals(0, g.getValue(row, col));
            }
        }
    }

    @Test
    public void testNewLoadEmptyWithComments() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/emptyComments.dat");

        for (int col = 0; col < 9; col++)
        {
            for (int row = 0; row < 9; row++)
            {
                assertEquals(0, g.getValue(row, col));
            }
        }
    }

    @Test
    public void testNewLoadPartialFilled() throws Exception
    {
        int values[][] =
        {
            {
                0, 0, 0, 0, 0, 0, 0, 0, 0
            },
            {
                0, 6, 3, 4, 5, 8, 9, 1, 0
            },
            {
                0, 7, 8, 9, 6, 1, 2, 3, 0
            },
            {
                0, 9, 4, 1, 3, 7, 8, 5, 0
            },
            {
                0, 8, 7, 2, 4, 5, 3, 6, 0
            },
            {
                0, 2, 5, 8, 9, 6, 7, 4, 0
            },
            {
                0, 5, 2, 6, 8, 4, 1, 9, 0
            },
            {
                0, 3, 1, 5, 2, 9, 4, 7, 0
            },
            {
                0, 0, 0, 0, 0, 0, 0, 0, 0
            }
        };

        Grid g = new Grid("test/colemanTestFiles/partial.dat");

        for (int col = 0; col < 9; col++)
        {
            for (int row = 0; row < 9; row++)
            {
                assertEquals(values[row][col], g.getValue(row, col));
            }
        }
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoadFileNotFound() throws Exception
    {
        Grid g = new Grid("notthere.dat");
    }

    @Test(expected = FileFormatException.class)
    public void testLoadTooFewRows() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/tooFewLines.dat");
    }

    @Test(expected = FileFormatException.class)
    public void testLoadTooManyRows() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/tooManyLines.dat");
    }

    @Test(expected = FileFormatException.class)
    public void testLoadNonIntValues() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/nonIntValue.dat");
    }

    @Test(expected = FileFormatException.class)
    public void testLoadRowTooShort() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/lineTooShort.dat");
    }

    @Test(expected = FileFormatException.class)
    public void testLoadRowTooLong() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/lineTooLong.dat");
    }

    @Test(expected=FileFormatException.class)
    public void testLoadInvalidGridRow() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/badrow.dat");
    }

    @Test(expected=FileFormatException.class)
    public void testLoadInvalidGridColumn() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/badcolumn.dat");
    }

    @Test(expected=FileFormatException.class)
    public void testLoadInvalidSubGrid() throws Exception
    {
        Grid g = new Grid("test/colemanTestFiles/badsubgrid.dat");
    }
    
    @Test
    public void testSetCompletGridLegal()
    {
        int values[][] = makeComplete();

        Grid g = new Grid();

        // If setValue (incorrectly) throws an error, the test will fail.
        for (int row = 0; row < 9; row++)
        {
            for (int col = 0; col < 9; col++)
            {
                g.setValue(row, col, values[row][col]);
            }
        }

        for (int col = 0; col < 9; col++)
        {
            for (int row = 0; row < 9; row++)
            {
                assertEquals(values[row][col], g.getValue(row, col));
            }
        }

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueIllegalRowIndex9()
    {
        Grid g = new Grid();

        g.setValue(9, 5, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueIllegalRowIndexNegative()
    {
        Grid g = new Grid();

        g.setValue(-1, 5, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueIllegalColumnIndex9()
    {
        Grid g = new Grid();

        g.setValue(5, 9, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueIllegalColumnIndexNegative()
    {
        Grid g = new Grid();

        g.setValue(5, -1, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValueNegativeValue()
    {
        Grid g = new Grid();

        g.setValue(5, 5, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValueValueTooBig()
    {
        Grid g = new Grid();

        g.setValue(5, 5, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValueZero()
    {
        Grid g = new Grid();

        g.setValue(5, 5, 0);
    }

    private Grid makeWithAllOnes()
    {
        Grid g = new Grid();

        // Set all the 1's for a legal grid
        g.setValue(0, 1, 1);
        g.setValue(1, 7, 1);
        g.setValue(2, 5, 1);
        g.setValue(3, 3, 1);
        g.setValue(4, 0, 1);
        g.setValue(5, 8, 1);
        g.setValue(6, 6, 1);
        g.setValue(7, 2, 1);
        g.setValue(8, 4, 1);

        return g;
    }

    @Test
    public void testSetValueRowViolation()
    {
        for (int row = 0; row < 9; row++)
        {
            testRowViolation(row);
        }
    }

    private void testRowViolation(int row)
    {
        // try to add a value already in the row.
        Grid g = new Grid();

        for (int first = 0; first < 9; first++)
        {
            g.setValue(row, first, 1);

            for (int i = 1; i < 9; i++)
            {
                if (first != i)
                {
                    try
                    {
                        g.setValue(row, i, 1);
                        fail("when grid[" + row + "," + first + "] is 1, it should be illegal to set grid["
                                + row + "," + i + "] to 1.");
                    }
                    catch (IllegalArgumentException e)
                    {
                        // good;
                    }
                }

            }
            g.clearValue(row, first);
        }
    }

    @Test
    public void testSetSameValue()
    {
        Grid g = new Grid();

        // it is legal to set the value on top of itself.
        for (int row = 0; row < 9; row++)
        {
            for (int col = 0; col < 9; col++)
            {
                g.setValue(row, col, 1);
                assertTrue(g.isLegalSet(row, col, 1));
                // This should not throw an exception
                g.setValue(row, col, 1);
                g.clearValue(row, col);
            }
        }
    }

    @Test
    public void testSetValueColumnViolation()
    {
        for (int col = 0; col < 9; col++)
        {
            testColViolation(col);
        }
    }

    private void testColViolation(int col)
    {
        Grid g = new Grid();

        for (int first = 0; first < 9; first++)
        {
            g.setValue(first, col, 1);

            for (int i = 1; i < 9; i++)
            {
                if (first != i)
                {
                    try
                    {
                        g.setValue(i, col, 1);
                        fail("when grid[" + first + "," + col + "] is 1, it should be illegal to set grid["
                                + i + "," + col + "] to 1.");
                    }
                    catch (IllegalArgumentException e)
                    {
                        // good;
                    }
                }
            }
            g.clearValue(first, col);
        }
    }

    @Test
    public void testSetValueSubGridViolation()
    {
        for (int tlrow = 0; tlrow < 9; tlrow += 3)
        {
            for (int tlcol = 0; tlcol < 9; tlcol += 3)
            {
                testGridViolation(tlrow, tlcol);
            }
        }
    }

    private void testGridViolation(int tlrow, int tlcol)
    {
        Grid g = new Grid();

        for (int firstrow = tlrow; firstrow < tlrow + 3; firstrow++)
        {
            for (int firstcol = tlcol; firstcol < tlcol + 3; firstcol++)
            {
                g.setValue(firstrow, firstcol, 1);

                testGridDups(g, tlrow, tlcol, firstrow, firstcol);

                g.clearValue(firstrow, firstcol);
            }
        }
    }

    private void testGridDups(Grid g, int tlrow, int tlcol, int firstrow, int firstcol)
    {
        for (int row = tlrow; row < tlrow + 3; row++)
        {
            for (int col = tlcol; col < tlcol + 3; col++)
            {
                if (!(row == firstrow && col == firstcol))
                {
                    try
                    {
                        g.setValue(row, col, 1);
                        fail("Should throw IllegaArgumentException");
                    }
                    catch (IllegalArgumentException e)
                    {
                        // good
                    }
                }
            }
        }
    }

    @Test
    public void testSetValueRowColumnAndSubGridViolation()
    {
        Grid g = makeWithAllOnes();

        // Anywhere that isn't already a 1 cannot be set to 1 legally
        for (int row = 0; row < 9; row++)
        {
            for (int col = 0; col < 9; col++)
            {
                if (g.getValue(row, col) != 1)
                {
                    try
                    {
                        g.setValue(row, col, 1);
                        fail("(" + row + "," + col + ") cannot be set to 1");
                    }
                    catch (IllegalArgumentException e)
                    {
                        // good
                    }
                }
            }
        }
    }

    @Test
    public void testChangeValueLegal()
    {
        Grid g = new Grid();

        g.setValue(5, 5, 5);

        // This should not throw an exception
        g.setValue(5, 5, 4);

        assertEquals(4, g.getValue(5, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeValueRowViolation()
    {
        Grid g = new Grid();

        g.setValue(5, 5, 5);
        g.setValue(5, 0, 4);

        g.setValue(5, 0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeValueColumnViolation()
    {
        Grid g = new Grid();

        g.setValue(5, 5, 5);
        g.setValue(0, 5, 4);

        g.setValue(0, 5, 5);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeValueSubGridViolation()
    {
        Grid g = new Grid();

        g.setValue(5, 5, 5);
        g.setValue(3, 3, 4);

        g.setValue(3, 3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeValueRowColumnAndSubGridViolation()
    {
        Grid g = new Grid();

        g.setValue(1, 1, 5);
        g.setValue(3, 0, 5);
        g.setValue(3, 0, 5);

        g.setValue(0, 0, 5);
    }

    @Test
    public void testClearToMakeValueLegal()
    {
        // a value is illegal, but by removing a value it becomes legal
        Grid g = new Grid();

        g.setValue(5, 5, 5);

        assertFalse(g.isLegalSet(5, 4, 5));

        g.clearValue(5, 5);

        assertTrue(g.isLegalSet(5, 4, 5));
    }

    @Test
    public void testSaveEmpty() throws Exception
    {
        try
        {
            Grid g = new Grid();

            g.save("empty.dat");

            Grid h = new Grid("empty.dat");

            for (int row = 0; row < 9; row++)
            {
                for (int col = 0; col < 9; col++)
                {
                    assertEquals(0, h.getValue(row, col));
                }
            }

        }
        finally
        {
            Files.delete(FileSystems.getDefault().getPath("empty.dat"));
        }

    }

    @Test
    public void testSavePartial() throws Exception
    {
        try
        {
            Grid g = new Grid();

            for (int row = 0; row < 9; row++)
            {
                for (int col = 0; col < 9; col++)
                {
                    if (row == col)
                    {
                        g.setValue(row, col, col + 1);
                    }
                }
            }

            g.save("partial.dat");

            g = new Grid("partial.dat");

            for (int row = 0; row < 9; row++)
            {
                for (int col = 0; col < 9; col++)
                {
                    if (row == col)
                    {
                        assertEquals(row + 1, g.getValue(row, col));
                    }
                    else
                    {
                        assertEquals(0, g.getValue(row, col));
                    }
                }
            }
        }
        finally
        {
            Files.delete(FileSystems.getDefault().getPath("partial.dat"));
        }
    }

    @Test
    public void testSaveFull() throws Exception
    {
        int values[][] = makeComplete();

        Grid g = new Grid();

        // If setValue (incorrectly) throws an error, the test will fail.
        for (int row = 0; row < 9; row++)
        {
            for (int col = 0; col < 9; col++)
            {
                g.setValue(row, col, values[row][col]);
            }
        }

        try
        {
            g.save("full.dat");

            g = new Grid("full.dat");

            for (int col = 0; col < 9; col++)
            {
                for (int row = 0; row < 9; row++)
                {
                    assertEquals(values[row][col], g.getValue(row, col));
                }
            }
        }
        finally
        {
            Files.delete(FileSystems.getDefault().getPath("full.dat"));
        }

    }
}
