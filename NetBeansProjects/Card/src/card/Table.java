/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package card;
/**
 *
 * @author nicholascicchetti
 */
public class Table 
{
    private TableNode head;
    
    public Table()
    {
        head = null;
    }
   
    public void add(Card newCard)
    {
        TableNode temporary = new TableNode(newCard);
        temporary.setNext(head);
        head = temporary;
    }
    
    public void removeSet(Card one,Card two,Card three)
    {
        TableNode current = head;
        TableNode previous = null;
        
        Card temporaryCard = null;
        
        if(one.isSet(two, three))
        {
            {
               if(!this.onTable(one))
               {
                   return;
               }
               
               if(!this.onTable(two))
               {
                   return;
               }
               if(!this.onTable(three))
               {
                   return;
               }
                else 
                 {
                   return;
                 }
        }
      }
        this.removeCard(one);
        this.removeCard(two);
        this.removeCard(three);
    }
    
    public boolean onTable(Card one)
    {
        TableNode current = head;
        
        while(current != null)
        {
            if(one.equals(current.getCard()))
            {
                return true;
            }
        }
        return false;
    }
    public int numCards()
    {
     TableNode current = head;
     int currentCardsCounter = 0;
     while(current != null)
     {
         current = current.getNext();
         currentCardsCounter++;
     }
     return currentCardsCounter;
    }
    
    public Card getCard(int result)
    {
        TableNode current = head;
        for(int j = 0; j < result; j++)
        {
            current = current.getNext();
        }
        return current.getCard();
    }
    
    public int numSets()
    {
        int firstIndex = 0, secondIndex = 1, thirdIndex = 2;
        Card temporaryone, temporarytwo, temporarythree;
        int numberOfSets = 0;
        while(firstIndex < secondIndex && thirdIndex < numCards())
        {
            while(thirdIndex < numCards())
            {
                temporaryone = getCard(firstIndex);
                temporarytwo = getCard(secondIndex);
                temporarythree = getCard(thirdIndex);
                if(temporaryone.isSet(temporarytwo, temporarythree))
                {
                    numberOfSets++;
                }
                thirdIndex++;
            }
            secondIndex++;
        thirdIndex = secondIndex +1;
        }
        firstIndex++;
        secondIndex = firstIndex + 1;
        thirdIndex = firstIndex + 2;
        return numberOfSets;
    }
    
    private void removeCard(Card thisCard)
    {
        TableNode current = head;
        TableNode previous = null;
        
        while (current != null)
        {
            if(!thisCard.equals(current.getCard()))
            {
                previous = current;
                current = current.getNext();
            }
            else 
            {
                if (previous == null)
                {
                    head = current.getNext();
                    return;
                }
                else 
                {
                    previous.setNext(current.getNext());
                    return;
                }
                }
            }
        }
    }
    

