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
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public void setLength (double length){
        this.length = length;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public void setLengthAndWidth (double length, double width)
    {
        this.length= length;
        this.width = width;
    }
    public double getPerimeter ()
    {
        return 2 * (length +width);
    }
    public double getArea ()
    {
        return length * width;
    }
}
