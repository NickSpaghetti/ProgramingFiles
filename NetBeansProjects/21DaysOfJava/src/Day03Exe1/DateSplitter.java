/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day03Exe1;

/**
 *
 * @author Nick
 */
public class DateSplitter
{
    private String date ="";
    
    public DateSplitter(String newDate)
    {
        date = newDate;
    }
    
    public String getDate()
    {
        return date;
    }
    
    private String monthSplitter()
    {
        String month = date.substring(0, 2);
        return month;
    }
    public String getMonth()
    {
        return this.monthSplitter();
    }
    
    private String daySplitter()
    {
        String day = date.substring(3, 5);
        return day;
    }
    
    public String getDay()
    {
        return this.daySplitter();
    }
    
    private String yearSplitter()
    {
        String year = date.substring(6, 8);
        return year;
    }
    
    public String getYear()
    {
        return this.yearSplitter();
    }
}
