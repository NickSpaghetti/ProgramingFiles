/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurrencespoj;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class RecurrenceSPoj
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner usr = new Scanner(System.in);
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("0");
        BigInteger n = new BigInteger("0");
        BigInteger m = new BigInteger("0");
        BigInteger i = new BigInteger("0");
        BigInteger ans = new BigInteger("0");
        int t = usr.nextInt();
        for(int z = 0; z < t; z++ )
        {
            a = usr.nextBigInteger();
            b = usr.nextBigInteger();
            n = usr.nextBigInteger();
        }
        int q = 10;
        while (q !=0)//usr.hasNextBigInteger())
        { 
            ans = applyCrazyFunction(a,n,m);
            System.out.println(ans);
            q--;
        }
    }
    
    
    public static BigInteger applyCrazyFunction(BigInteger a, BigInteger b, BigInteger n){
       
        if (n.compareTo(BigInteger.ZERO)== 0 ){
            return BigInteger.ONE;
        }
        BigInteger m = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        m = m.modPow(a, b);
        if(n.mod(two) != BigInteger.ZERO){
            m = (m.multiply(a));
            m.mod(m); 
        }
        
        return m;
    }

}
