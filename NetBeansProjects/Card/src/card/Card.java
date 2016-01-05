/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author nicholascicchetti
 * Set Program
 */


public class Card 
{   //This is the private varables for the Card class
    private int color, shading, shape, quantity; 
    //This is the Card Constructor.
    public Card(int cardQuantity, int cardColor, int cardShading, int cardShape)
    {   
        //sets my private ints to my constructor ints.
        quantity = cardQuantity %= 3;
        color = cardColor %= 3;
        shading = cardShading %= 3;
        shape = cardShape %= 3;
        
        //cardQuanity is modded by three to make any number entered by a user 1, 2, or 3.
        //if cardQuanity hits any of these conditions then add 3 to cardQuanity.
        if (quantity == 0 || quantity == -1 || quantity == -2)
        {
            quantity += 3;
        }
        //cardColor is modded by a three to make any number entered by a user 1, 2, or 3.
        //if cardColor hits any of these conditions then add a 3 to cardColor.
        if (color == 0 || color == -1 || color == -2)
        {
            color += 3;
        }

        //if cardColor hits any of these conditions then add a 3 to cardColor.
        if (shading == 0 || shading == -1 || shading == -2)
        {
            shading += 3;
        }
        //cardShape is modded by a three a three to make any number entred by a user 1, 2, or 3.
        //if cardShape is hits any of these conditions then add a 3 to cardShape.
        if(shape == 0 || shape == -1 || shape == -2)
        {
            shape += 3;
        }
        
    }
        //my get method for Quanity.
        public int getQuantity()
        {
            return quantity;
        }
        //my get method for Color.
        public int getColor()
        {
            return color;
        }
        //my get method for Shading.
        public int getShading()
        {
            return shading;
        }
        //my get method for Shape. 
        public int getShape()
        {
            return shape;
        }
        
        //below is my isSet method, and it is used to validate if there is a set between three cards.
        public boolean isSet(Card two, Card three)
        {
            //the interger sum will hold the values of quanity, color, shading, and shape.  Then it will check against method to see if it is not equal to 0. 
            //If all the if statments pass then the method isSet will return true.
            int sum;
            sum = ((this.quantity + two.getQuantity() + three.getQuantity()) % 3);
            if(sum !=0)
            {
                return false;   
            }
            sum = ((this.color + two.getColor() + three.getColor()) % 3);
            if(sum !=0)
            {
                return false;
            }
            sum = ((this.shading + two.getShading() + three.getShading()) % 3);
            if(sum !=0)
            {
                return false;
            }
            sum = ((this.shape + two.getShape() + three.getShape()) % 3);
            if(sum !=0)
            {
                return false;
            }
            
            return true;
        }
        
        public String toString()
        {
            /*Color code
             *1 = Red -> R
             *2 = Green -> G
             *3 = Purple -> P
             */ 
            
            String colorOfCard = "";
            if(color == 1)
            {
               colorOfCard = "R";
            }
            if(color == 2)
            {
               colorOfCard = "G";
            }
            if(color == 3)
            {
                colorOfCard = "P";
            }
            /*Shading Code
             *1 = Open -> O
             *2 = Striped -> T
             *3 = Solid -> S;
             */
            String shadingOfCard = "";
            if(shading == 1)
            {
                shadingOfCard = "O";
            }
            if(shading == 2)
            {
                shadingOfCard = "T";
            }
            if(shading == 3)
            {
                shadingOfCard = "S";
            }
            /*Shape Code
             *1 = Oval -> O
             *2 = Diamond -> D
             *3 = Squiggle -> S
             */
            String shapeOfCard = "";
            if(shape == 1)
            {
                shapeOfCard = "O";
            }
            if(shape == 2)
            {
                shapeOfCard = "D";
            }
            if(shape == 3)
            {
                shapeOfCard = "S";
            }
            return quantity +  colorOfCard  + shadingOfCard + shapeOfCard;
        }
        public boolean equals(Object obj)
            {
                Card that = (Card)obj;
                return quantity == that.getQuantity() &&
                       color == that.getColor() &&
                       shading == that.getShading() &&
                       shape == that.getShape();
                
                
            }        
}

