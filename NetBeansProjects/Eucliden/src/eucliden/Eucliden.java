/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eucliden;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class Eucliden
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner uin = new Scanner(System.in);
        ArrayList cordnents = new ArrayList(); 
        while(uin.next() != null){
            for(int i = 0; i < 12; i++){
                cordnents.add(uin.nextInt());
            }
            
        }
        
    }
    
}
