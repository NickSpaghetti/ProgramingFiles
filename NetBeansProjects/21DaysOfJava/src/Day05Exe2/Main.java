/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day05Exe2;

/**
 *
 * @author Nick
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        FourDPoint FDP = new FourDPoint(1,2,3,4); // i am calling the class by making an object calld FDP, which takes in 4 values see the other class 
        FDP.VarAssation(); // i am calling the method varASsation with the FDP object
        System.out.println("All Var have been changed");
        FDP.x += FDP.y;
        FDP.y += FDP.y;
        FDP.Point3 += FDP.Point4;
        FDP.Point4 += FDP.Point4;
        FDP.VarAssation();
        
    }
    
}
