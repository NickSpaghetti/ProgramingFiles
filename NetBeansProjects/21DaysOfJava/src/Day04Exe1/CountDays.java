/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day04Exe1;

/**
 *
 * @author Nick
 */
public class CountDays
{

    public int countDays(int month, int year)
    {
        int count = -1;
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0)
                {
                    count = 29;
                }
                else
                {
                    count = 28;
                }
                if ((year % 100 == 0) & (year % 400 != 0))
                {
                    count = 28;
                }
                
        }
        
        return count;
    }
}
