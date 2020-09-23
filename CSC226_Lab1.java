/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc226_lab1;
import java.util.Scanner;
/**
 *
 * @author JonRi
 */
public class CSC226_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String repeatProgram = "";
        do {
            System.out.println("What shape do you want to work with?");
            System.out.println("Enter 1 for Rectangle, 2 for Triangle, 3 for Circle");
            Scanner input = new Scanner(System.in);
            int shapeNumber = input.nextInt();
            input.nextLine(); // input.nextInt leaves /n character that causes problems
            
            switch(shapeNumber)
            {
                case 1: do_Rectangle_Operations(); 
                break;
                
                case 2: do_Triangle_Operations();
                break;
                
                case 3: do_Circle_Operations();
                break;
                
                default: System.out.println("Invalid selection.  ");
                break;
            }
            
            System.out.println("Do you want to repeat the program?  y/n");
            repeatProgram=input.nextLine();
        } while (repeatProgram.startsWith("y") || repeatProgram.startsWith("Y"));
    }
    
    public static void do_Rectangle_Operations()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double length = input.nextInt();
        System.out.println("Enter width of the rectangle");
        double width = input.nextInt();
        Rectangle rectangle1 = new Rectangle(length, width);
        System.out.println("Rectangle area: " + rectangle1.getArea());
        System.out.println("Rectangle perimiter: " + rectangle1.getPerimeter());
        input.nextLine(); // input.nextInt leaves /n character that causes problems
    }
    
    
    public static void do_Triangle_Operations()   
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of side1: ");
        double s1 = input.nextInt();
        System.out.println("Enter length of side2: ");
        double s2 = input.nextInt();
        System.out.println("Enter length of side3: ");
        double s3 = input.nextInt();
        Triangle triangle1 = new Triangle(s1, s2, s3);
        System.out.println("Triangle perimeter: " + triangle1.getPerimiter());
        System.out.println("Triangle area: " + triangle1.getArea());
        input.nextLine(); // input.nextInt leaves /n character that causes problems  
    }
    
    public static void do_Circle_Operations()   
    {
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter radius of circle: ");
        double radius = input.nextInt();
        Circle circle1 = new Circle(radius);
        System.out.println("Circle perimeter: " + circle1.getPerimiter());
        System.out.println("Circle area: " + circle1.getArea());
        input.nextLine(); // input.nextInt leaves /n character that causes problems
    }
    
}
