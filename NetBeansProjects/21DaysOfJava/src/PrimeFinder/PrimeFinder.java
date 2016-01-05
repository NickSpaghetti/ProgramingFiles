/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeFinder;

/**
 *
 * @author Nick
 */
public class PrimeFinder
{

    public long target;
    public long prime;
    public boolean finished = false;
    private Thread runner;

    public PrimeFinder(long inTarget)
    {
        target = inTarget;
        if (runner == null)
        {
            runner = new Thread((Runnable) this);
            runner.start();

        }

    }

    public void run()
    {
        long numPrimes = 0;
        long candiate = 2;
        while (numPrimes < target)
        {
            if(isPrime(candiate))
            {
                numPrimes++;
                prime = candiate;
            }
            candiate++;
        }
        finished = true;
    }

    private boolean isPrime(long checkNumber)
    {
        double root = Math.sqrt(checkNumber);
        for(int i = 2; i <= root; i++)
        {
            if(checkNumber % i == 0)
            {
                return false;
            }
            
        }
        return true;
    }
}
