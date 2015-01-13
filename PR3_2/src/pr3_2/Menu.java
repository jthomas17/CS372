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
public class Menu {

    Scanner input = new Scanner(System.in);

    public void menu() {
        System.out.println("Please choose what shape you want to make: ");
        System.out.println("1: traingle\n"
                + "2: ellipse\n"
                + "3: rectangle");
        int uinput = input.nextInt();
        if (uinput == 1) {
            enterTriangle tr = new enterTriangle();
            tr.enter();
        } else if (uinput == 2) {
            enterEllipse el = new enterEllipse();
            el.enter();
        } else if (uinput == 3) {
            enterRectangle rt = new enterRectangle();
            rt.enter();
        } else {
            System.out.println("Enter a correct value!");
            System.out.println();
            menu();
        }

    }
}
