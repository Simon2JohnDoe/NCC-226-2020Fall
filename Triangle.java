/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc226_lab1;
import java.lang.Math;
/**
 *
 * @author JonRi
 */
public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double s1, double s2, double s3)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    
    public void setSide1(double s1)
    {
        this.side1 = s1;
    }
    public void setSide2 (double s2)
    {
        this.side2 = s2;
    }
    public void setSide3 (double s3)
    {
        this.side3 = s3;
    }
    public void setAllSides (double s1, double s2, double s3)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public double getArea ()
    {
        
        double P = getPerimiter();
        double S = (P/2);
        return Math.sqrt((S*(S-side1)*(S-side2)*(S-side3)));
    }
    public double getPerimiter()
    {
        return side1+side2+side3;
    }
}
