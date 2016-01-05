package ncdriverandomsequence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nicholascicchetti
 */
import java.util.Random;

public class StringGenerator 
{

    private RandomSequence sequence = new RandomSequence(new UniformGenerator());
    private String str = "";
    private int newMin, newMax;
    private double random;
   
    public StringGenerator(String r, int min, int max)
    {
        this.str = r;
        this.newMin = min;
        this.newMax = max;
    }
    
    public void seek(int pos)
    {
        sequence.seek(pos);
    }
    
    public String next()
    {   
        double seqHolder = sequence.next();
        random = (int)(seqHolder*(newMax - newMin + 1)) + newMin;
        String lineCount= "";
        for(int i = 0; i < random; i++)
        {
            lineCount += str + " ";
        }
        return lineCount;
    }
}
