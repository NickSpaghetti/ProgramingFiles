/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancecounter;

/**
 *
 * @author Nick
 */
public class InstanceCounter
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Counter c = new Counter();
        System.out.println("Starting with " + c.getCount() + " objects");
        for (int i = 0; i < 100; i++)
        {
            
            Counter z = new Counter();
            System.out.println(z.getCount());
        }
        
        System.out.println("Created " + c.getCount() + " objects" );
        
    }
    
}
