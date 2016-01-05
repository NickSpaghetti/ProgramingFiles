package edu.moravian;

/**
 * This class represents the characters as they are added and
 * removed during a search of the board.
 * 
 * @author nickcicchetti
 */
public class WordPath extends java.lang.Object
{
    StringBuffer word;

    /**
     * Create a new instance with no characters
     */
    public WordPath()
    {
        //creates a new word From StringBuffer
        word = new StringBuffer();
    }

    /**
     * Push the character onto the end of the word.  'q' will be added
     * as a "qu"
     * @param ch the character to add
     * 
     * @throws IllegalStateException if the path contains 16 letters
     */
    public void push(char ch) 
    {
        //if the paths length is larger than 16 throw a new IllegalStateException.
        if (word.length() > 16)
        {
            throw new IllegalStateException("You can not have a word larger than 16 letters");
        } else {
           // adds ch at the end of the word
           word.append(ch); 
        }    
        
        //checks to see if the size of the path is <= 14 if so it can safely append "qu" else throw new IllegalStateException
       
       this.getWord();
    }

    /**
     * Remove the last character from the word.  "qu" will be removed
     * together.
     *
     * @throws IllegalStateException if there are no letters currently
     *  in the path.
     */
    public void pop()
    {
        if (word.length() <= 0)
        {
            throw new IllegalStateException("You can not pop a letter off of a non existing Word");
        } else {
             //finds the last index of the word and removes the the character at that possison
             word.deleteCharAt(word.length()-1);
        }
        
  
    }

    /**
     * Get the word represented by this path.
     *
     * @return the current word (possibly the empty string)
     */
    public String getWord()
    { 
        return word.toString().toLowerCase().replaceAll("q", "qu");
    }
}
