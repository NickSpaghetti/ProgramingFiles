/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day02Exe1;

/**
 *
 * @author Nick
 */
public class Investment
{
    private double initalValue = 0;
    private double firstYearGain = 0;
    private double secondYearLoss = 0;
    private double thirdYearIncresse = 0;
    
    
    public Investment(double newinitalValue, double newFirstYearGain, double newSecondYearLoss, double newThridYearIncresse)
    {
        initalValue = newinitalValue;
        firstYearGain = newFirstYearGain;
        secondYearLoss = newSecondYearLoss;
        thirdYearIncresse = newThridYearIncresse;
    }
    
    private double firstYear()
    {
        double percentDifference = initalValue;
        double newValue = percentDifference * firstYearGain;
        double afterYearOne = percentDifference + newValue; 
        
        return afterYearOne;   
    }
    
    public double getFirstYear()
    {
        return this.firstYear();
    }
    
    private double secondYear()
    {
        double lostAmount = this.firstYear() - secondYearLoss;
        
        return lostAmount;
    }
    
    public double getSecondYear()
    {
        return this.secondYear();
    }
    
    private double thirdYear()
    {
        double startingPercentage = this.secondYear();
        double newValue =  startingPercentage *  thirdYearIncresse;
        double afterYearThree = startingPercentage + newValue; 
        
        return afterYearThree;
    }
    
    public double getThirdYear()
    {
        return this.thirdYear();
    }
    
}
