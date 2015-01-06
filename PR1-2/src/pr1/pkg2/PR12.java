/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1.pkg2;

/**
 *
 * @author jthomas17
 */
/**
 * Main class
 */
public class PR12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * @param initialize string name to a name
        */
         String name = "Jack";
         /**
          * @param if new argument is entered give different name
          */
        if(args.length > 0 && args[0].equalsIgnoreCase("new name"))
            name = "Pear";
        /**
          * @param if new argument is entered give different name
          */
        else if(args.length > 0 && args[0].equalsIgnoreCase("dif name"))
            name = "bob";
        /**
          * @param if new argument is entered give different name
          */
        else if(args.length > 0 && args[0].equalsIgnoreCase("not this name"))
            name = "Jain";
        /**
         * @param Prints out name based on arguments given
         */
        System.out.println(name);
    }
    
}
