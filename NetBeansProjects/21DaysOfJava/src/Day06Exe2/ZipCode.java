/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day06Exe2;

/**
 *
 * @author Nick
 */
public class ZipCode
{

    private boolean validZipCode;
    private String zipCode;
    private int zipCodeLength;

    public ZipCode(String Zip)
    {
        this.zipCode = Zip;
        this.zipCodeLength = Zip.length();

    }

    public boolean isValidZipCode()
    {
        if ((zipCodeLength == 5) | (zipCodeLength == 9)){
        
            System.out.println("You entered a valid zip code!");
            validZipCode = true;
            return validZipCode;
            
        }else{
            System.out.println("Please re-enter a valid zipCode with a lengh of 5.  The length of your zipcode is " + zipCode.length());
            validZipCode = false;
            return validZipCode;
        
        }
    }

}
