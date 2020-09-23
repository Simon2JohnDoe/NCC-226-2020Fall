/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc226_lab1;
/**
 *
 * @author JonRi
 */
public class Circle {
    
    private double radius;
    
    public Circle (double radius)
    {
        this.radius = radius;
    }
    public void setRadius (double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    public double getPerimiter()
    {
                return getCircumference();
    }
    
    
}
