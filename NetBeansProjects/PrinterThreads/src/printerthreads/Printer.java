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
public class Printer implements Runnable
{

    private String name;
    private SequenceGenerator seqGen;

    public Printer(String name, SequenceGenerator seqGen)
    {
        this.name = name;
        this.seqGen = seqGen;
    }

    @Override
    public void run()
    {
        
        int next = seqGen.next();
        while (next < 5000)
        {
            System.out.println(name + "'s next: " + next);
            next = seqGen.next();
        }
        
    }
}
