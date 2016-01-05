/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day02Exe2;

/**
 *
 * @author Nick
 */
public class Main
{
    public static void main(String[] args){
        double num1 = 45;
        double num2 = 98;
        
        System.out.println("we start with two numbers number 1: " + num1 + " number 2: " + num2);
        System.out.println("First we will divied each number by 5");
        System.out.println(num1 + "/" + 5 + " = "+ num1 / 5 + "\t" + num2 + "/" + 5 + " = " + num2 / 5);
        System.out.println("Now lets find the remander of each number");
        System.out.println("The remander of " + num1 + "/" + 5 + " = "+ num1 / 5 + " is " + num1%5 + "\t" + 
                           "The remander of " + num2 + "/" + 5 + " = " + num2 / 5 + " is " + num2%5);
        

    }
}
   

 
