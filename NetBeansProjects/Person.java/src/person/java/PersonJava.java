/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person.java;

/**
 *
 * @author nicholascicchetti
 */
public class PersonJava {

    public static void main(String[] args) {
        Player player1 = new Player("Jerome", 17);
        
        String yourName = player1.getUserName();
        System.out.println(yourName + " " + player1.getAge());
        
        Player location = new Player("Macungie", "18062");
        String yourCity = location.getCity();
        String yourZip = location.getZip();
        System.out.println(yourCity + " " + yourZip);
        
    }
}
