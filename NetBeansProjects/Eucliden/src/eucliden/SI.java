/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eucliden;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class SI
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner uin = new Scanner(System.in);
        int numCases = uin.nextInt();
        double initalBet;
        double initalWager;
        double wager;
        double outcome;
        for(int i = 0; i < numCases; i++){
            initalBet = uin.nextDouble();
            initalWager = uin.nextDouble();
            for(int j = 0; j < initalWager; j++){
                wager = uin.nextInt();
                outcome = uin.nextInt();
            }
            
        }
    }
    
}
