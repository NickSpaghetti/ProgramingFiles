/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.moravian;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author nicholascicchetti
 */
public class Main
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws edu.moravian.BadFileFormatException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, BadFileFormatException
    {
        Lexicon lex = new Lexicon("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/LexiconWords");
        DiceManager dice = new DiceManager("/Users/nicholascicchetti/NetBeansProjects/BoggleSimulation/src/edu/moravian/Boggle");
        Double timesPlayed = 1000000.0;
        int count = 0;
        for(int i = 0; i < timesPlayed; i++)
        {
            Board board = Board.makeRandomBoard(dice);
            Searcher search = new Searcher(board, lex);
            search.search();
            count+=search.getNumWords();
        }
        System.out.print("The average number of words on a boggle board ran " + timesPlayed + " times" + " is " + count/timesPlayed + " Words");
    }

    }
    
