/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncdriverandomsequence;
import java.util.Random;
/**
 *
 * @author nicholascicchetti
 */
public class GaussianGenerator implements NumberGenerator
{
    private final Random rand = new Random();
    @Override
    public  double next()
    {
        return rand.nextGaussian();
    }
}
