/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import java.io.BufferedReader;
import java.io.FileReader;
import org.junit.Test;
import java.lang.IllegalStateException;
import edu.moravian.Grid;
import java.io.*;

/**
 *
 * @author nicholascicchetti
 */
public class GridJunit
{

    @Test
    public void emptyGrid()
    {
        Grid emptyGrid = new Grid();
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                assertEquals(0, emptyGrid.getValue(i, j));
            }
        }

    }

    @Test
    public void testGoodFile() throws IOException, ArrayIndexOutOfBoundsException, FileFormatException
    {
        Grid createGrid = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/ForResetGrid");
        assertEquals(8, createGrid.getValue(0, 0));
        assertEquals(1, createGrid.getValue(0, 1));
        assertEquals(3, createGrid.getValue(8, 8));

    }

    @Test
    public void testGoodFileValeus() throws IOException, ArrayIndexOutOfBoundsException, FileFormatException
    {
        Grid createGrid = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/ForResetGrid");
        assertEquals(8, createGrid.getValue(0, 0));
        assertEquals(1, createGrid.getValue(0, 1));
        assertEquals(2, createGrid.getValue(0, 2));
        assertEquals(5, createGrid.getValue(0, 3));
        assertEquals(3, createGrid.getValue(0, 4));
        assertEquals(7, createGrid.getValue(0, 5));
        assertEquals(6, createGrid.getValue(0, 6));
        assertEquals(4, createGrid.getValue(0, 7));
        assertEquals(9, createGrid.getValue(0, 8));
        assertEquals(9, createGrid.getValue(1, 0));
        assertEquals(8, createGrid.getValue(1, 1));
        assertEquals(4, createGrid.getValue(1, 2));
        assertEquals(6, createGrid.getValue(1, 3));
        assertEquals(1, createGrid.getValue(1, 4));
        assertEquals(5, createGrid.getValue(1, 5));
        assertEquals(7, createGrid.getValue(1, 6));
        assertEquals(2, createGrid.getValue(1, 7));
        assertEquals(3, createGrid.getValue(1, 8));
        assertEquals(9, createGrid.getValue(8, 0));
        assertEquals(8, createGrid.getValue(8, 1));
        assertEquals(4, createGrid.getValue(8, 2));
        assertEquals(6, createGrid.getValue(8, 3));
        assertEquals(1, createGrid.getValue(8, 4));
        assertEquals(5, createGrid.getValue(8, 5));
        assertEquals(7, createGrid.getValue(8, 6));
        assertEquals(2, createGrid.getValue(8, 7));
        assertEquals(3, createGrid.getValue(8, 8));

    }

    @Test
    public void testBadFilename() throws IOException, FileNotFoundException, FileFormatException
    {
        try
        {
            Grid fileNotFounds = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/For");
            fileNotFounds.getValue(0, 0);

        }
        catch (FileNotFoundException ex)
        {

        }

    }

    @Test
    public void testForComments() throws IOException, FileNotFoundException, FileFormatException
    {
        Grid fileWithComments = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/FileWithComments");
        fileWithComments.save("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/CommentedSavedFile");
    }

    @Test
    public void testTooFewRows() throws IOException, FileNotFoundException, FileFormatException
    {
        try
        {
            Grid tooFewLines = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/TooFewRows");

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Too Few Lines");
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Your Array is out of bounds!");
        }

    }

    @Test
    public void testTooFewCols() throws IOException, FileNotFoundException, ArrayIndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid tooFewLines = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/TooFewRows");

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Too Few Lines");
        }
        catch (IOException ex)
        {
            System.out.print("IOEXCEPTION");
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Your Array is out of bounds!");
        }

    }

    @Test
    public void testCantReadFile() throws IOException, IndexOutOfBoundsException, IllegalStateException, ArrayStoreException, NumberFormatException, FileFormatException
    {
        try
        {
            Grid failtest = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/BadData");
        }
        catch (NumberFormatException ex)
        {
            System.out.println("You can only store integers in this array");
        }

    }

    @Test
    public void isClearGridRowOutOfBounds() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid mustBeLegealRow = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/sudukuSample");
            mustBeLegealRow.clearValue(9, 1);
        }
        catch (IndexOutOfBoundsException ex)
        {

        }
    }

    @Test
    public void isClearGridColOutOfBounds() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid mustBeLegealCol = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/sudukuSample");
            mustBeLegealCol.clearValue(0, 9);
        }
        catch (IndexOutOfBoundsException ex)
        {

        }
    }

    @Test
    public void testClearRowCol() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid clearThatSpace = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/sudukuSample");
            clearThatSpace.clearValue(8, 7);
        }
        catch (IndexOutOfBoundsException ex)
        {

        }
    }

    @Test
    public void testReset() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid clearThatGrid = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/ForResetGrid");
            clearThatGrid.reset();
        }
        catch (IndexOutOfBoundsException ex)
        {

        }
    }

    @Test
    public void testSave() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid saveThatGrid = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/ForResetGrid");
            saveThatGrid.save("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/SavingGridToFile");
        }
        catch (IndexOutOfBoundsException ex)
        {

        }
    }

    @Test
    public void testSetValue() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid setThatGridsValue = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/ForResetGrid");
            setThatGridsValue.setValue(8, 3, 4);
            setThatGridsValue.save("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/SavingGridToFile");
        }
        catch (IndexOutOfBoundsException ex)
        {

        }

    }

    @Test
    public void testWrongSetValue() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid setThatGridsValueInvalid = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/ForResetGrid");
            setThatGridsValueInvalid.setValue(9, 3, 4);
            setThatGridsValueInvalid.save("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/SudukuSampleSave");
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("The value you set did not meet the requirments of grid");
        }
    }

    @Test
    public void isGridLegeal() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid isGridLegeal = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/ForResetGrid");
            isGridLegeal.isLegalSet(0, 0, 8);
            isGridLegeal.isLegalSet(8, 8, 3);
            assertEquals(true, true);
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("The value you set did not meet the requirments of grid");
        }

    }

    @Test
    public void isGridNotLegeal() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid isNotGridLegeal = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/ForResetGrid");
            isNotGridLegeal.isLegalSet(0, 0, 1);
            isNotGridLegeal.isLegalSet(8, 8, 4);
            assertEquals(false, false);
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("The value you set did not meet the requirments of grid");
        }

    }

    @Test
    public void testGetValue() throws IOException, FileNotFoundException, FileFormatException
    {
        Grid getGrid = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/sudukuSample");
        assertEquals(1, getGrid.getValue(0, 0));

    }

    @Test
    public void testGoodFile2() throws IOException, ArrayIndexOutOfBoundsException, FileFormatException
    {
        Grid getGoodGrid = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/sudukuSample");
        assertEquals(1, getGoodGrid.getValue(0, 0));
        assertEquals(9, getGoodGrid.getValue(8, 0));
        assertEquals(9, getGoodGrid.getValue(4, 4));

    }

    @Test
    public void testSave2() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid saveThatGrid2 = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/sudukuSample");
            saveThatGrid2.save("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/SavingGridToFile");
        }
        catch (IndexOutOfBoundsException ex)
        {

        }
    }

    @Test
    public void testSettingValuesToZeros() throws IOException, FileNotFoundException, IndexOutOfBoundsException, FileFormatException
    {
        try
        {
            Grid settingValuesToZero = new Grid("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/SetingValuesToZero");
            settingValuesToZero.setValue(0, 0, 0);
            settingValuesToZero.toString();
            settingValuesToZero.save("/Users/nicholascicchetti/NetBeansProjects/Suduku/src/edu/moravian/SettingValuesToZeroSave");
            assertEquals(1, settingValuesToZero.getValue(0, 0));
            System.out.print(settingValuesToZero + " YOu are in the seetinvalues to zero ");
            System.out.println(" ");
        }
        catch (IndexOutOfBoundsException ex)
        {

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Too Few Lines");
        }
        catch (IOException ex)
        {
            System.out.print("IOEXCEPTION");
        }
    }
}
