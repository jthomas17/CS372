/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2;

import java.util.Scanner;

/**
 *
 * @author jthomas17
 */
public class enterRectangle {

    Scanner input = new Scanner(System.in);

    public void enter() {
        System.out.println("Please enter the two sides of the ractangle");
        System.out.println("First side: ");
        int side1 = input.nextInt();
        System.out.println("Second side: ");
        int side2 = input.nextInt();
        Rectangle r = new Rectangle(side1, side2);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
