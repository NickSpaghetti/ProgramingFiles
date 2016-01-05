/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slayer.calculator;
import java.util.Scanner;
/**
 *
 * @author nicholascicchetti
 */
public class Player 
{
 // these are the private verables.
 private float playerXp;
 private String userName;
 //below is the constructor.
 public Player (int playerXps , String playerName)
 {
     playerXp = playerXps;
     userName = playerName;
     System.out.println("Please enter your user name.");
     Scanner jinUserName = new Scanner(System.in);
     userName = jinUserName.next();
     System.out.println("Please enter your current xp in Slayer");
     Scanner jinPlayerXp = new Scanner(System.in);
     playerXp = jinPlayerXp.nextFloat();
 }
 
 public String getUserName()
 {
     return userName;
 }
 
 public float getPlayerXp()
 {
     return playerXp;
 }
}
