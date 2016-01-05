/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day05Exe2;
import java.awt.Point;

/**
 *
 * @author Nick
 */
public class FourDPoint extends Point //Point is the superclass of FourDPoint because it extends from it
{
    //int Point1;
    //int Point2;
    int Point3;
    int Point4;
    FourDPoint(int P1, int P2, int P3, int P4){ //this is a constructor notice that i have 4 paramters they must be filled when called apon
        super(P1,P2); // this is a super classes becase FourDPoint extends the class Point i can use its paramaters you wont need this too often
        //what you want to do is this
        //this.Point1 = P1
        //this.Point = P2
        this.Point3 = P3;
        this.Point4 = P4;
    }
    
    void VarAssation(){ // this is a method
        System.out.println("Point1 is this.x because it is from the Super Class Point :" + this.x);
        System.out.println("Point2 is this.y because it is from the Super Class Point :" + this.y);
        System.out.println("Point3 is Point3 because it is defined from out constructor :" + Point3);
        System.out.println("Point4 is Point4 because it is defined from out constructor :" + Point4);
    } 
}
