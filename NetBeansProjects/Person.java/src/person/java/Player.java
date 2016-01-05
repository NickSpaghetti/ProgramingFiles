/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person.java;

/**
 *
 * @author nicholascicchetti
 */
public class Player {
    String userName;
    int age;
    String city, zip;

    
   public Player(String u, int a)
   {
    userName = u;
    age = a;
       
   }
   
   public String getUserName()
   {
       return userName;
   }
   
   public int getAge()
   {
       return age;
   }
   
   public Player(String c, String z)
   {
       city = c;
       zip = z;
   }
   
   public String getCity()
   {
       return city;
   }
   
   public String getZip()
   {
       return zip;
   }
}