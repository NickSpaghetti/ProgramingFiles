/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day03Exe2;

/**
 *
 * @author Nick
 */
public class Main
{
    public static void main(String[] args){
      
        SetClassValues scv = new SetClassValues(64.7,157.7,15.0);
        System.out.println("Height: " + scv.DisplayHeight());
        System.out.println("Weight: " +scv.DisplayWeight());
        System.out.println("Depth: " + scv.DisplayDepth());
    }
}