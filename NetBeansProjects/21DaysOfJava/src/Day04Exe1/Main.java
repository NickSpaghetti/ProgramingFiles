/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day04Exe1;


/**
 *
 * @author Nick
 */
public class Main
{
    public static void main(String[] args){
        CountDays cd = new CountDays();
        int years = 2016;
        
        for (int i = 1; i <= 12; i++)
        {
            for(int j = 1; j <= cd.countDays(i, years); j++){
                System.out.println(i + " " + j + " " + years);
                
            }
            
        }
    }
}
