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
public class Counter
{
    private static int instanceCounter = 0;
    
    protected int getCount()
    {
        return instanceCounter;
    }
    
    protected static void addCount()
    {
        instanceCounter++;
    }
    
    Counter()
    {
        Counter.addCount();
    }
}
