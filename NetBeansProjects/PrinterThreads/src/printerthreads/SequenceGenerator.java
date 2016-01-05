/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printerthreads;

/**
 *
 * @author nicholascicchetti
 */
public class SequenceGenerator
{
    private static SequenceGenerator SequenceGeneratorInstance = new SequenceGenerator();

    private int i = 0;

    public static SequenceGenerator getInstance()
    {
        return SequenceGeneratorInstance;
    }
    public synchronized int next()
    {
        int current = i;
        i += 1;
        return current;
    }
}
