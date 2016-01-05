/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julka;
import java.util.*;
import java.math.*;
/**
 *
 * @author Nick
 */
public class Julka
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        for (int t = 0; t < 10; t++) {
            BigInteger A = new BigInteger(in.next());
            BigInteger B = new BigInteger(in.next());
            BigInteger K = (A.add(B)).divide(new BigInteger("2"));
            BigInteger N = A.subtract(K);
            System.out.println(K.toString());
            System.out.println(N.toString());
        }
    }
    
}
