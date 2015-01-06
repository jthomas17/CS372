/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_4;
import java.util.Scanner;

/**
 *
 * @author jthomas17
 */
public class PR1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * intialize input
         */
        Scanner input = new Scanner(System.in);
        /**
         * prints out <code>What is the radius of the circle?</code>
         */
        System.out.println("What is the radius of the circle?");
        /**
         * intializes radius based off user input 
         */
        int radious = input.nextInt();
        /**
         * give PI a value
         */
        final double PI = 3.14;
        /**
         * calculates area of circle based off user radius
         */
        double area = PI * radious * radious;
        System.out.println(area);       
    }
    
}
