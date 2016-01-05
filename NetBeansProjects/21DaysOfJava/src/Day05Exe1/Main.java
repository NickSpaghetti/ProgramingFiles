/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day05Exe1;

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
        ValcanoRobot vc = new ValcanoRobot("Collecting Meterial",10,610);
        vc.checkTemperature();
        vc.showAttributes();
    }
    
}
