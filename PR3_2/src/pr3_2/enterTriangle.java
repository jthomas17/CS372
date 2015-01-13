/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2;

import java.util.*;

/**
 *
 * @author jthomas17
 */
public class enterTriangle {

    Scanner input = new Scanner(System.in);

    public void enter() {
        System.out.println("Please enter the three sides of the triangle");
        System.out.println("The first two sides entered must add up to be longer than the last side entered: ");
        System.out.println("First side: ");
        int side1 = input.nextInt();
        System.out.println("Second side: ");
        int side2 = input.nextInt();
        System.out.println("Enter the longest side: ");
        int side3 = input.nextInt();
        Triangle t = new Triangle(side1, side2, side3);
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());
        
    }
}
