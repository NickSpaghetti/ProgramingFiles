/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mohawkindiandemographycalculator;

/**
 *
 * @author nicholascicchetti
 */
public class MohawkIndianDemographyCalculator
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int cassle1People = 864 , cassle2People = 278, cassle3People = 768, cassle4People = 1466, cassle5People =100, cassle6People = 100;
        int village1 = 96, village2 = 192, village3 = 144, village4 = 224;
        int totalMohawkPop = cassle1People + cassle2People + cassle3People + cassle4People + cassle5People + cassle6People + village1 + village2 + village3 + village4;
        System.out.println("You have a total of : " + totalMohawkPop + " of Mohawk People ");
        int men, women, children;
        children = totalMohawkPop / 2;
        System.out.println("You have a toal of : " + children + " People");
        men = children / 2;
        System.out.println("Total number of men: "+ men);
        women = men;
        System.out.println("You have a total number of " + "women" + women);
    }
    
}
