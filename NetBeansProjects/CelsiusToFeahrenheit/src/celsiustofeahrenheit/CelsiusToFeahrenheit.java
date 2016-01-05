/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celsiustofeahrenheit;
import java.util.Scanner;

public class CelsiusToFeahrenheit
{
   
    public static void main(String[] args)
    {
        double celsius, feahrenheit;
        Scanner userinput = new Scanner(System.in);
        
        System.out.println("Please enter a temp in deg in Celsius");
        celsius = userinput.nextDouble();
        feahrenheit = (celsius * 9)/5+32;
        System.out.println("You started out with deg: " + celsius + " and you convert it to " + feahrenheit);
        for(int i = 1; i <= 10; i++ )
        {
            System.out.println("On " + "day "+ i + " it was " + celsius +"degreese in celsius " +  " and now its " + feahrenheit + "in feahreheit");
            celsius++;
            feahrenheit++;
        }
    }
    
}
