package edu.moravian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class loads and maintains the list of dice.
 *
 * @author nicholascicchetti
 */
public class DiceManager
{

    private ArrayList<Die> diesArray;

    /**
     * At creation, load the 16 dicefrom the specified file into the new
     * manager.
     *
     * The format for the file is 16 lines of data, each of which contain
     * exactly 6 characters separated by spaces. Since "qu" is always
     * represented together on a single side, this pair is also legal (Note that
     * this means that 'q' and 'qu' are both legal).
     *
     * Blank lines and lines starting with '#' will be ignored.
     *
     * @param filename the filename to process
     * @throws java.io.FileNotFoundException if the file cannot be opened
     * @throws java.io.IOException if an IO error occurs during the read
     * @throws edu.moravian.BadFileFormatException if the file does not follow
     * the specified format.
     */
    public DiceManager(String filename) throws FileNotFoundException, IOException, BadFileFormatException {
        diesArray = new ArrayList<>();
        char[] lineChar = new char[6];
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String blankline = "";
        String line;
        int numDice = 0;
        try {
            while ((line = in.readLine()) != null) {
                String[] items = line.split(" ");
                if(items.length==0)
                    continue;
                if (numDice == 16 && (!items[0].equals("#")) && (!items[0].equals(""))) {
                    in.close();
                    throw new BadFileFormatException("Too many rows");

                } else if (items.length > 6 && !items[0].equals("#") && !items[0].equals("")) {
                    in.close();
                    throw new BadFileFormatException("Too many characters in row");
                } 
                            
                else if (!items[0].equals("#") && items.length != 0 && (!items[0].equals(""))) {
                    for (int i = 0; i < 6; i++) {
                        if (items[i].length() != 1) {
                            if (!items[i].toLowerCase().equals("qu")) {
                                in.close();
                                throw new BadFileFormatException("too long of string that isn't QU");
                            }
                        }
                        if (!Character.isLetter(items[i].charAt(0))) {
                            throw new BadFileFormatException("Not a letter");
                        }
                        lineChar[i] = items[i].charAt(0);
                    }
                    diesArray.add(new Die(lineChar[0], lineChar[1], lineChar[2], lineChar[3], lineChar[4], lineChar[5]));
                    numDice++;

                }

            }
            if (numDice < 16) {
                throw new BadFileFormatException("Not enough rows");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new BadFileFormatException("Not enough characters in row");
        } finally {
            in.close();
        }
    }

    

       
        /**
         * Get the die at the specified index
         *
         * @param index the index
         * @return the die at that index
         * @throws IllegalArgumentException if index is less than 0 or greater
         * than 15
         */
    public Die getDie(int index)
    {
        if (index < 0)
        {
            throw new IllegalArgumentException("The index can not be greater than 1");
        }
        if (index > 15)
        {
            throw new IllegalArgumentException("The index can not be less than 15");
        }
        return (diesArray.get(index));
    }
}
