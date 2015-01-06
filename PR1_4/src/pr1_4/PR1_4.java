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
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        int radious = input.nextInt();
        final double PI = 3.14;
        double area = PI * radious * radious;
        System.out.println(area);       
    }
    
}
