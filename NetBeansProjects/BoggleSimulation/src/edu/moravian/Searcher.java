/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.util.ArrayList;

/**
 *
 * @author nicholascicchetti
 */
public class Searcher
{
 
    private ArrayList<String> wordList;
    private Lexicon lexicon;
    private WordPath wPath;
    private BoardMarks bMarks;
    private Board brd;
    private int count;
    
    /**
     * Create a searcher for the specified board and words
     * @param board the board to search
     * @param words the words to search for
     */
    public Searcher(Board board, Lexicon words)
    {
        wordList = new ArrayList<>();
        lexicon = words;
        wPath = new WordPath();
        bMarks= new BoardMarks();
        brd = board;
        count = 0;
    }

    /**
     * Perform the search and save a list of words found.
     * This method can only be called once per instance.
     * @throws IllegalStateException if the search was already performed
     */
    public void search()
    {
        if(count == 1)
            throw new IllegalStateException();
        count++;
        wPath= new WordPath();
        Location l;
        for(int i =0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                l = new Location(i,j);
                wPath.push(brd.getValue(l));
                bMarks.mark(l);
                helpSearch(l);
                wPath.pop();
                bMarks.unmark(l);
            }
        }
    }


    /**
     * Get the words found by the search.  This method should not be called
     * before search() is called.  The intent of this method is to be used
     * in a for each loop: for(String word : searcher.getWords())
     * @return the iterable "list" of words
     * @throws IllegalStateException if this method is called before search
     */
    public Iterable<String> getWords()
    {
        if(count == 0)
            throw new IllegalStateException();
        return wordList;
    }
    
    public int getNumWords()
    {
        if(count == 0)
            throw new IllegalStateException();
        return wordList.size();
    }
    private void helpSearch(Location loc)
    {
        for (Location l : bMarks.getNeighbors(loc)) {
            wPath.push(brd.getValue(l));
            bMarks.mark(l);
            if(wPath.getWord().length()>=3 && lexicon.isWord(wPath.getWord()) && !wordList.contains(wPath.getWord()))
            {
                wordList.add(wPath.getWord());
            }
            if (lexicon.isPrefix(wPath.getWord())) {
                helpSearch(l);
            }
            wPath.pop();
            bMarks.unmark(l);
        }
    }
}
