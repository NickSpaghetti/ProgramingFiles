/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitty;

/**
 *
 * @author Nick
 */
public class Car
{
    private double fuel; 
    private final double fuelEfficiency;//in miles per gallon       

    
public Car(double Efficiency)
{fuelEfficiency = Efficiency;
fuel = 0;}

public void drive (double amount) //amount in miles
{fuel -= fuel * amount/fuelEfficiency;}

public void addGas (double amount) //amount of gallons
{fuel += amount;}

public double getGasInTank () //
{return fuel;}

}
