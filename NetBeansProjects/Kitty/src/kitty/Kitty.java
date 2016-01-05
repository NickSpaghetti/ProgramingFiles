/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitty;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class Kitty
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println(" /\\_/\\" + "      ---------");
        System.out.println("( .  .)" + "    /          \\");
        System.out.println("/     \\" + "   |hello world|");
        System.out.println("\\     /" + "   \\           /");
        System.out.println(" || ||" + "     -----------");
        System.out.println("  u u");
        
        ArrayList name = new ArrayList();
        ArrayList bDay = new ArrayList();
        
        name.add("Ben");
        name.add("Nick");
        name.add("Jake");
        bDay.add("07/11/95");
        bDay.add("07/28/94");
        bDay.add("05/22/20");
        
        for(int i = 0; i < name.size() && i < bDay.size(); i++)
        {
            System.out.println(name.get(i) + "\t" + bDay.get(i));
        }
        
        MathStuff m = new MathStuff();
        
         m.Maxs(7, 6);
        
        Scanner in = new Scanner(System.in);
        
        
        
        if(in.hasNextDouble())
        {
            System.out.println("the number you entered is a double");
        } else {
            System.out.println("the number you entered is not a double");
        }
        
        double num = in.nextDouble();
        
        System.out.println(num);
        
        DrawShapes ds = new DrawShapes('*');
        
        //ds.drawTriangle(10);
        ds.drawPyramid(10);
        
        
       
        
        
    }
    
}
