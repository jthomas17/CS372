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
//PT -- Good that you broke this out. Is it possible to make this more generic, too?
//     This is similar to enterRectangle and enterTriangle
public class enterEllipse {
    Menu m = new Menu();
Scanner input = new Scanner(System.in);
    public void enter (){
        System.out.println("Please enter the two radiuses of the ellipse: ");
        System.out.println("First radius: ");
        int radius1 = input.nextInt();
        System.out.println("Second radius: ");
        int radius2 = input.nextInt();
        Ellipse e = new Ellipse(radius1, radius2);
        System.out.println("Area: " + e.getArea());
        System.out.println("Perimeter: " + e.getPerimeter());
       
    }
}

