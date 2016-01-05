package edu.moravian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents the word list. You can check to see if a word is
 * contained or a prefix is contained in the lexicon.
 *
 * @author nicholascicchetti
 */
public class Lexicon
{

    ArrayList<String> words;
    ArrayList<ArrayList<String>> pList;

    /**
     * Create a word list from the specified file
     *
     * @param filename the file to read
     * @throws java.io.FileNotFoundException if the file cannot be found
     * @throws java.io.IOException if an IO Error occurs while reading
     * @throws edu.moravian.BadFileFormatException
     */
public Lexicon(String filename) throws FileNotFoundException, IOException
{
        words = new ArrayList<>();
        pList = new ArrayList();
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = in.readLine()) != null) {
            String[] word = line.split(" ");
            if (!(word[0].startsWith("#")) || !(word.length==0)) {
                if (word.length > 1 && !(word[0].startsWith("#"))) {
                    in.close();
                    throw new IOException("Too many words");
                }
                else if(!word[0].equals(""))
                {
                    words.add(word[0].toLowerCase());
                }
            }
        }
        in.close();
        Collections.sort(words);
        int maxLength = 0;
        for(String s: words)
        {
            if(s.length()>maxLength)
                maxLength = s.length();
        }
        ArrayList<String> list;
        for(int i = 0; i < maxLength; i++)
        {
            list = new ArrayList();
            for(String s: words)
            {
                if(s.length()>=i)
                    list.add(s.substring(0, i));
            }
            pList.add(list);
        }
    }

    /**
     * Determine if the specified string is a prefix for any of the words
     *
     * @param prefix the prefix to test
     * @return true if the prefix occurs in the lexicon, false otherwise
     */
    public boolean isPrefix(String prefix) 
    {
        ArrayList<String> lst = new ArrayList<String>();
        for(int i = 0; i < words.size(); i++)
        {
            if(words.get(i).length()>=prefix.length())
            {
                lst.add(words.get(i).substring(0,prefix.length()));
            }
        }
        String pLower = prefix.toLowerCase();
        int searcher = Collections.binarySearch(lst,pLower);
        return searcher >=0;
    }

    /**
     * Determine if the specified word is contained in the lexicon
     *
     * @param word the word to check
     * @return true if the word occur, false otherwise
     */
    public boolean isWord(String word) 
    {
        String wrdLower = word.toLowerCase();
        int searcher = Collections.binarySearch(words,wrdLower);
        return searcher >= 0;
    }
}