/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day04Exe2;

/**
 *
 * @author Nick
 */
public class NumberConv
{
   String strNum;
   public NumberConv(String newStrNum)
   {
       this.strNum = newStrNum.toLowerCase();   
   }
   public NumberConv()
   {
       
   }
   
   public long numberConv(){
       long newNum = 1;
       switch (strNum){
           case "one":
               newNum = 1;
               break;
           case "two":
               newNum = 2;
               break;
           case "three":
               newNum = 3;
               break;
           case "four":
               newNum = 4;
               break;
           case "five":
               newNum = 5;
               break;    
           case "six":
               newNum = 6;
               break;
           case "seven":
               newNum = 7;
               break;
           case "eight":
               newNum = 8;
               break; 
           case "nine":
               newNum = 9;
               break;
           case "ten":
               newNum = 10;
               break;
           default:
               System.out.println("the string you enterend did not match one - ten so the default value is 1");
       }
               
       return newNum;
   }
   
}
