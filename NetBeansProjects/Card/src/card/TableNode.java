/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author nicholascicchetti
 */
public class TableNode 
{
   private TableNode next;
   private Card theCard;
   
   public TableNode(Card cardNode)
   {
        theCard = cardNode;
   }
   
   public void setNext(TableNode tn)
   {
       next = tn;
   }
   
   public TableNode getNext()
   {
       return next;
   }
   
   public Card getCard()
   {
       return theCard;
   }
   
   
}
