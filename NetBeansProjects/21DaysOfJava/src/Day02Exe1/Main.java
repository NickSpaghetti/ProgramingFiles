/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day02Exe1;

/**
 *
 * @author Nick
 */
public class Main
{
    public static void main(String[] args)
    {
        Investment inv = new Investment(14000, .4,1500,.12);
        double firstYear = inv.getFirstYear();
        System.out.println("The total gain for the first years investment is: " + firstYear);
        double secondYear = inv.getSecondYear();
        System.out.println("The total loss for the second years investment is: " + secondYear);
        double thirdYear = inv.getThirdYear();
        System.out.println("The total gain for the second year investment is: " + thirdYear);
    }
    
}
