/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printerthreads;

import java.util.ArrayList;

/**
 *
 * @author nicholascicchetti
 */
public class PrinterThreads
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 40; i++)
        {
            threads.add(new Thread(new Printer("Thread " + i, SequenceGenerator.getInstance())));
            threads.get(i).start();
        }

    }
}
