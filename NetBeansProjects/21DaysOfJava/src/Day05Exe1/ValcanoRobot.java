/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day05Exe1;

/**
 *
 * @author Nick
 */
public class ValcanoRobot
{
    private String status;
    private int speed;
    private float temp;
    ValcanoRobot(String newStatus, int newSpeed, float newTemp){
        
        this.status = newStatus;
        this.temp = newTemp;
        this.speed = newSpeed;
        
    }
    
    void checkTemperature(){
        if (temp > 600){
            status = "returning home";
            speed = 5;
        }
    }
    
    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temp);
    }
    
}
