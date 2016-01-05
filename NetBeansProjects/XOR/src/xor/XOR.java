/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xor;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class XOR
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int q = input.nextInt();
        if((p + q) != 1 )
        {
            System.out.println(0);
        } else{
            System.out.println(p + q);
        }
    }
    
}
