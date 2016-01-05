/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithbigint;

import java.math.BigInteger;

/**
 *
 * @author Nick
 */
public class FunWithBigInt
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        for (BigInteger bi = BigInteger.valueOf(100);
                bi.compareTo(BigInteger.ZERO) > 0;
                bi = bi.subtract(BigInteger.ONE))
        {

            System.out.println(bi);

        }

    }
}
