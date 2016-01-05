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
public class PrimeThreads
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String[] arg = {"1","3","100","1000"};
        PrimeThreads pt = new PrimeThreads(arg);
    }

    private PrimeThreads(String[] arg)
    {
        PrimeFinder[] finder = new PrimeFinder[arg.length];
        for(int i = 0; i < arg.length; i++)
        {
            try{
                long count = Long.parseLong(arg[i]);
                finder[i] = new PrimeFinder(count);
                System.out.println("Looking for prime: " + count);
                
            }catch (NumberFormatException NFE){
                System.out.println("Error: " + NFE.getMessage());
            }
        }
        boolean complete = false;
        while(!complete)
        {
          complete = true;
          for(int j = 0; j <finder.length; j++)
          {
              if(finder[j] == null) continue;
              if(!finder[j].finished)
              {
                  complete = false;
              }else{
                  displayResult(finder[j]);
                  finder[j] = null;
              }
          }
          try{
              Thread.sleep(1000);
          }catch (InterruptedException ie){
              // do nothing
          }
        }
    }
    
    private void displayResult(PrimeFinder finder)
    {
        System.out.println("Prime " + finder.target + "is " + finder.prime);
        
    }
}
