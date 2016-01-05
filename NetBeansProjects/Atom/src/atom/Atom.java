/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atom;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class Atom
{
    public static void main(String[] args)
    {   
        int testCase = 0, totalSeconds,mDn,initialVal = 0;
        Scanner uin = new Scanner(System.in);
        BigInteger startAtom = new BigInteger("0");
        BigInteger breakAtom = new BigInteger("0");
        BigInteger maxAtom = new BigInteger("0");
        BigInteger diviserAtom = new BigInteger("0");
        BigInteger product = new BigInteger("1");
        
        testCase = uin.nextInt();
        //while there are still testcases
        while(testCase > 0){
          //gets the user input
            startAtom = uin.nextBigInteger();
            breakAtom = uin.nextBigInteger();
            maxAtom = uin.nextBigInteger();
            totalSeconds = 0;
            
            initialVal = startAtom.compareTo(maxAtom);
            System.out.println("initalValue is " + initialVal);
            if(initialVal == 1 || initialVal == 0){
                System.out.println("0");
            } else {
                diviserAtom = maxAtom.divide(startAtom);
                System.out.println("diviserAtom = " + diviserAtom);
                mDn = product.compareTo(diviserAtom);
                System.out.println("mDm = " + mDn);
                while(mDn ==-1){
                    product = product.multiply(breakAtom);
                    System.out.println("product = " + product);
                    mDn = product.compareTo(maxAtom);
                    System.out.println("While mDn" + mDn);
                    if(mDn == 1 || mDn == 0){
                        System.out.println("hi");
                        totalSeconds++;
                    }
                }
                System.out.println(totalSeconds);
                    testCase--;
            }
            /*initialVal = startAtom.compareTo(maxAtom);
            System.out.println("initalVal = " + initialVal);
            if(initialVal != -1){
                System.out.println("(0)");
            }else{
                diviserAtom = maxAtom.divide(startAtom);
                setVal = product.compareTo(diviserAtom);
                System.out.println("setVal = " + setVal);
                while(setVal != -1){
                    product.multiply(breakAtom);
                    diviserAtom = maxAtom.divide(startAtom);
                    retVal = product.compareTo(diviserAtom);
                    if(retVal != -1){
                        totalSeconds++;
                        System.out.println("retVal in while = " + retVal);
                        setVal = retVal;
                        System.out.println("setVal in while = " + setVal);
                    }
                }
                testCase--;
                System.out.println("totalSeconds ("+totalSeconds+")");
            */
            }
            //setval = product.compareTo(maxAtom);
            //System.out.println("steval = " + setval);
            //while(setval != 1){
                //totalSeconds++;
                //product = product.multiply(breakAtom);
            //}
            //if(totalSeconds > 0){
               // System.out.println(totalSeconds-1);
            //}else{
               // System.out.println(0);
            //}
            /*retVal = breakAtom.compareTo(maxAtom.divide(startAtom));
            System.out.println("my ret val is " + retVal);
            if(retVal == -1 || retVal == 0){
                totalSeconds++;
                product = startAtom.multiply(breakAtom);
                retVal2 = breakAtom.compareTo(maxAtom.divide(product));
                System.out.println("my retVal2 is " + retVal2);
                while(retVal2 != -1 || retVal2 != 0){
                    totalSeconds++;
                    product = product.multiply(breakAtom);
                }
            }
            testCase--;
            System.out.println(totalSeconds);
        } */
        
        
    }
    
   }
