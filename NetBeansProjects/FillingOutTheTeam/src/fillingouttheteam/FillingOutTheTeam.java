/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fillingouttheteam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class FillingOutTheTeam
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double speed;
        boolean[] player = new boolean[3];
        int weight, strenth;
        Scanner uin = new Scanner(System.in);
        while(true){
            boolean  pos = false;
            speed = uin.nextDouble();
                weight = uin.nextInt();
                strenth = uin.nextInt();
                if(speed == 0 && weight == 0 && strenth == 0){
                    break;
                }
                player[0] = isWideReciver(speed,weight,strenth);
                if(player[0] == true){
                    pos = true;
                    System.out.print("Wide Reciver ");
                }
                player[1] = isLineman(speed,weight,strenth);
                if(player[1] == true){
                    pos = true;
                    System.out.print("Lineman ");
                }
                player[2] = isQuarterBack(speed,weight,strenth);
                if(player[2] == true){
                    pos = true;
                    System.out.print("Quarterback");
                }
                if(pos == false){
                    System.out.print("No positions");
                    System.out.println("");
                }
            }
            
        }
        
    
    public static boolean isWideReciver(double speed, int weight, int streigth){
        if(speed <= 4.5 && weight  >= 150 && streigth >= 200){
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isLineman(double speed, int weight, int streigth){
        if(speed <= 6.0 && weight  >= 300 && streigth >= 500){
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isQuarterBack(double speed, int weight, int streigth){
        if(speed <= 5.0 && weight  >= 200 && streigth >= 300){
            return true;
        } else {
            return false;
        }
    }
    
}

