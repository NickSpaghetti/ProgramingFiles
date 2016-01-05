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
public class The_Ninja_Way
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner uin = new Scanner(System.in);
        int numTrees = uin.nextInt();
        int ninjaJump = uin.nextInt();
        int trees;
        int[] heights = new int[numTrees];
        
        while(numTrees != -1){
            for(int i = 0; i < numTrees; i++){
                heights[i] = uin.nextInt();
                
            }
        }
        
    }
    
}
