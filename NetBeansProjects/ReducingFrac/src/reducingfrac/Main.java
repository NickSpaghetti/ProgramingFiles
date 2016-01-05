/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reducingfrac;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class Main
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException
    {
        int n = 1;
        int i = 0;
        int xStrLoc;
        int xStrLast;
        int x, y, q;
        String xStr;
        String yStr;
        Scanner usr = new Scanner(System.in);
        while (usr.hasNext())
        {
            String stringNumusr = usr.next();
            if (stringNumusr == null)
            {
                break;
            }
            if (!stringNumusr.contains("/"))
            {
                String newStr = "/1";
                stringNumusr += newStr;
            }
            xStr = stringNumusr.replace('/', ' ');
            //System.out.println(xStr);
            xStrLoc = xStr.indexOf(' ');
            xStrLast = xStr.length();
            yStr = xStr.substring(xStrLoc + 1, xStrLast);
            //System.out.println(xStrLoc);
            xStr = xStr.substring(0, xStrLoc);
            //System.out.println(xStr);
            //System.out.println(yStr);
            x = Integer.parseInt(xStr);
            y = Integer.parseInt(yStr);
            q = gcd(x, y);
            x = (x / q);
            //System.out.println(x);
            y = (y / q);
            //System.out.println(y);
            xStr = Integer.toString(x);
            yStr = Integer.toString(y);
            if (yStr.equals("1"))
            {
                System.out.println("Case " + n + ": " + xStr);
            }
            else if (yStr.equals("0"))
            {
                System.out.println("Case " + n + ": " + "Divide By Zero");
            }
            else
            {
                stringNumusr = xStr + "/" + yStr;
                System.out.println("Case " + n + ": " + stringNumusr);
            }
            n++;
            i++;

        }

    }

 /*public static int gcd(int a, int b) {
  int r, i;
  while(b!=0){
    r = a % b;
    a = b;
    b = r;
  }
  return a;
}*/

    public static int gcd(int x, int y)
    {

        if (y == 0)
        {
            return x;
        }
        int z = gcd(y, x % y);
        return (z);

    }

}
