package edu.moravian;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


/**
 * This class represents a die for the game Boggle.  A Die is
 * rolled when it is created, and "remembers" its face value until
 * rolled again.
 * 
 * @author nicholascicchetti
 */
public class Die
{
    char[] dieSides = new char [6];
    private int rolledDie;
    /**
     * Create a new die and roll it. Note that 'q' should be used
     * when 'qu' is on the die
     *
     * @param side1 the character on the first side
     * @param side2 the character on the second side
     * @param side3 the character on the third side
     * @param side4 the character on the fourth side
     * @param side5 the character on the fifth side
     * @param side6 the character on the sixth side
     * @throws IllegalArgumentException if a non letter is passed
     */
    public Die(char side1, char side2, char side3, char side4, char side5, char side6)
    {
        
        if(Character.isLetter(side1) && Character.isLetter(side2) && Character.isLetter(side3) && Character.isLetter(side4) && Character.isLetter(side5) && Character.isLetter(side6))
        {
         dieSides[0] = side1;
         dieSides[1] = side2;
         dieSides[2] = side3;
         dieSides[3] = side4;
         dieSides[4] = side5;
         dieSides[5] = side6;
         this.roll();
        
        } 
        else { 
           throw new IllegalArgumentException("You can not put numbers into the array");     
        }
        
    }

    /**
     * Roll the die.
     */
    public void roll()
    {
        Random rnd = new Random();
        rolledDie = rnd.nextInt(6);
        
    }

    /**
     * Get the character "face up" on the die after the last roll.  Note
     * that 'q' will be returned when 'qu' is showing.
     * @return the character showing after the last roll.
     */
    public char getValue()
    {
        return dieSides[rolledDie];
    }
}
