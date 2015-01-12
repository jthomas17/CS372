/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

import java.util.*;

/**
 *
 * @author jthomas17
 */
public class PR2_4 {

    /**
     * @param args the command line arguments
     */
    // PT: -2. Comments below
    public static void main(String[] args) {
        ValueofPI pi = new ValueofPI();
        int userInput = 200000;
        if (args.length > 0 && args[0].equalsIgnoreCase("200000")) {
            //PT - why not use args[0]? And why force users to 200000?
            System.out.println("PI is: " + pi.findPI(userInput));
        }
        //PT - This could just be an else, no?
        if (args.length > 0 && !args[0].equalsIgnoreCase("200000"))
            System.out.println("Please enter 200000 in field");
    }

}
