/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifeuniverseeverything;
import java.util.Scanner;
/**
 *
 * @author Nick
 */
public class LifeUniverseEveryThing
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner us = new Scanner(System.in);
        int num = 0;
        while(true)
        {
            num = us.nextInt();
            if (num == 42){
                break;
            }
            System.out.println(num);
        }
    }
    
}
