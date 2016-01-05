/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import java.io.FileReader;

/**
 *
 * @author nicholascicchetti
 */
public class Game
{

    Table t;
    Deck d;

    public Game()
    {
        Table t = new Table();
        Deck d = new Deck();
        for (int i = 0; i <= 12; i++)
        {
            if (d.hasNext())
            {
                t.add(d.getNext());
            }

        }
    }

    public void Game(String filename)
    {
        Deck loadDeck = new Deck("src/card/deck.dat");

        for (int j = 0; j < numCards(); j++)
        {
            if (loadDeck.hasNext())
            {
                t.add(loadDeck.getNext());
            }

        }

    }

    public int numSet()
    {
        return t.numSets();
    }

    public int numCards()
    {
        return t.numCards();
    }

    public void playRound()
    {
        int removeSetCounter = 0;
        Card temp1;
        Card temp2;
        Card temp3;

        if (t.numSets() > 0)
        {
            for (int firstPointer = 0; firstPointer < numCards() && removeSetCounter < 1; firstPointer++)
            {

                for (int secondPointer = firstPointer + 1; firstPointer + 1 < numCards() && removeSetCounter < 1; secondPointer++)
                {

                    for (int thirdPointer = secondPointer + 1; secondPointer + 1 < numCards() && removeSetCounter < 1; thirdPointer++)
                    {
                        temp1 = t.getCard(firstPointer);
                        temp2 = t.getCard(secondPointer);
                        temp3 = t.getCard(thirdPointer);
                        
                        if(temp1 != null && temp2 != null && temp3 != null)
                        {
                            if(temp1.isSet(temp3, temp3))
                            {
                                removeSetCounter++;   
                            }
                                
                        }
                    }
                }

            }
            
        }
    }

    public boolean isGameOver()
    {
        if(t.numSets() >= 0 && d.hasNext() == true )
        {
           return false;
        } 
        return true;
    }

}
