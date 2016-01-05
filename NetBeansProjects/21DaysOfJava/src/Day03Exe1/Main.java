/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day03Exe1;

/**
 *
 * @author Nick
 */
public class Main
{
    public static void main(String[] args){
        DateSplitter Birthday = new DateSplitter("07/28/94");
        System.out.println("My Birthday is " + Birthday.getDate());
        System.out.println("The Month is " + Birthday.getMonth());
        System.out.println("The Day is " + Birthday.getDay());
        System.out.println("the Year is " + Birthday.getYear());

    }
}
