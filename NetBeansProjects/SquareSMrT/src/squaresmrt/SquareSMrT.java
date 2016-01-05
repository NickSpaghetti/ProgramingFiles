/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaresmrt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class SquareSMrT
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String[] nums;
        Scanner usr = new Scanner(System.in);
        String a,b,c;
        int num1,num2,ans;
        while(usr.hasNext()){
          c = usr.nextLine();
          nums = c.split(" ");
          a = nums[0];
          b = nums[1];
          num1 = Integer.parseInt(a);
          num2 = Integer.parseInt(b);  
          ans = sum(num1,num2);
          System.out.println(ans);
        }
    }
        
        public static int sum(int a, int b) {

        if (b >= a) {
            return b * b + sum(a, b - 1);
        }

        return 0;
        }
    
}
